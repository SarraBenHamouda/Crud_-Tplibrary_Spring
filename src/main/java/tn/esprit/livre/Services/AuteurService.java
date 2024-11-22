package tn.esprit.livre.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.livre.Entity.Auteur;
import tn.esprit.livre.Repository.AuteurRepository;
import java.util.List;

@Service
@AllArgsConstructor
class AuteurService implements IAuteurService{
    AuteurRepository AuteurRepository;

    @Override
    public List<Auteur> retrieveAllAuteurs() {
        return AuteurRepository.findAll();
    }

    @Override
    public Auteur addAuteur(Auteur auteur) {
        return AuteurRepository.save(auteur);
    }


    @Override
    public Auteur retrieveAuteur(Long idAuteur) {
        return AuteurRepository.findById(idAuteur).orElse(null);
    }

    @Override
    public void deleteAuteur(Long idAuteur) {
        AuteurRepository.deleteById(idAuteur);
    }

    @Override
    public Auteur modifyAuteur(Auteur auteur) {
        return AuteurRepository.save(auteur);
    }
}
