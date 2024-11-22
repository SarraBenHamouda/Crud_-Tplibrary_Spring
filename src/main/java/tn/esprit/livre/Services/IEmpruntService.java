package tn.esprit.livre.Services;

import tn.esprit.livre.Entity.Emprunt;

import java.util.List;

public interface IEmpruntService {
    List<Emprunt> retrieveAllEmprunts();
    Emprunt addEmprunt(Emprunt emprunt);
    Emprunt modifyEmprunt(Emprunt emprunt);
    Emprunt retrieveEmprunt(Long id);
    void deleteEmprunt(Long id);
}
