package tn.esprit.livre.Services;
import tn.esprit.livre.Entity.Auteur;
import java.util.List;

public interface IAuteurService {

        List<Auteur> retrieveAllAuteurs();
        Auteur addAuteur( Auteur auteur);
    Auteur modifyAuteur( Auteur auteur);
    Auteur retrieveAuteur(Long idAuteur);
        void deleteAuteur(Long idAuteur);
    }



