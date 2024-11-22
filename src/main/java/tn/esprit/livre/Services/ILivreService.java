package tn.esprit.livre.Services;

import tn.esprit.livre.Entity.Livre;

import java.util.List;

public interface ILivreService {

        List<Livre> retrieveAllLivres();
    Livre addLivre( Livre livre);
    Livre modifyLivre( Livre livre);
    Livre retrieveLivre(Long idLivre);
        void deleteLivre(Long idLivre);
    }


