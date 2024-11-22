package tn.esprit.livre.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.livre.Entity.Livre;
import tn.esprit.livre.Repository.LivreRepository;
import java.util.List;

@Service
@AllArgsConstructor
class LivreService implements ILivreService{
    LivreRepository LivreRepository;

    @Override
    public List<Livre> retrieveAllLivres() {
        return LivreRepository.findAll();
    }

    @Override
    public Livre addLivre(Livre livre) {
        return LivreRepository.save(livre);
    }


    @Override
    public Livre retrieveLivre(Long idLivre) {
        return LivreRepository.findById(idLivre).orElse(null);
    }

    @Override
    public void deleteLivre(Long idLivre) {
        LivreRepository.deleteById(idLivre);
    }

    @Override
    public Livre modifyLivre(Livre livre) {
        return LivreRepository.save(livre);
    }
}
