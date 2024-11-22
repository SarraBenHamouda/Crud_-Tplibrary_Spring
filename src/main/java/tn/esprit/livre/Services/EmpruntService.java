package tn.esprit.livre.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.livre.Entity.Emprunt;
import tn.esprit.livre.Repository.EmpruntRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmpruntService implements IEmpruntService {

    private final EmpruntRepository empruntRepository;

    @Override
    public List<Emprunt> retrieveAllEmprunts() {
        return empruntRepository.findAll();
    }

    @Override
    public Emprunt addEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    @Override
    public Emprunt retrieveEmprunt(Long id) {
        return empruntRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Emprunt with ID " + id + " not found"));
    }

    @Override
    public void deleteEmprunt(Long id) {
        if (empruntRepository.existsById(id)) {
            empruntRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Emprunt with ID " + id + " not found");
        }
    }

    @Override
    public Emprunt modifyEmprunt(Emprunt emprunt) {
        if (emprunt == null) {
            throw new IllegalArgumentException("Emprunt cannot be null");
        }

        // Ensure the emprunt has a valid ID before attempting to modify
        if (emprunt.getId() == null) {
            throw new IllegalArgumentException("Emprunt ID cannot be null");
        }

        // Check if the emprunt exists in the repository
        if (!empruntRepository.existsById(emprunt.getId())) {
            throw new IllegalArgumentException("Emprunt with ID " + emprunt.getId() + " not found");
        }

        // Proceed with saving the modified emprunt
        return empruntRepository.save(emprunt);
    }

}
