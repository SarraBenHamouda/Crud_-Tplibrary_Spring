package tn.esprit.livre.Services;


import tn.esprit.livre.Entity.Bibliotheque;
import java.util.List;

public interface IBibliothequeService {


    List<Bibliotheque> retrieveAllBibliotheques();
    Bibliotheque addBibliotheque( Bibliotheque b);
    Bibliotheque modifyBibliotheque( Bibliotheque b);
    Bibliotheque retrieveBibliotheque(Long idBibliotheque);
    void deleteBibliotheque(Long idBibliotheque);
    }

