package tn.esprit.livre.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.livre.Entity.Bibliotheque;
import tn.esprit.livre.Repository.BibliothequeRepository;
import java.util.List;

@Service
@AllArgsConstructor
class BibliothequeService implements IBibliothequeService{
    BibliothequeRepository BibliothequeRepository;

    @Override
    public List<Bibliotheque> retrieveAllBibliotheques() {
        return BibliothequeRepository.findAll();
    }

    @Override
    public Bibliotheque addBibliotheque(Bibliotheque b) {
        return BibliothequeRepository.save(b);
    }


    @Override
    public Bibliotheque retrieveBibliotheque(Long idBibliotheque) {
        return BibliothequeRepository.findById(idBibliotheque).orElse(null);
    }

    @Override
    public void deleteBibliotheque(Long idBibliotheque) {
        BibliothequeRepository.deleteById(idBibliotheque);
    }

    @Override
    public Bibliotheque modifyBibliotheque(Bibliotheque b) {
        return BibliothequeRepository.save(b);
    }
}
