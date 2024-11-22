package tn.esprit.livre.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livre.Entity.Auteur;
import tn.esprit.livre.Services.IAuteurService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/auteur")
public class AuteurController {

    IAuteurService AuteurService;
    // http://localhost:8089/livre/auteur/retrieve-all-auteurs
    @GetMapping("/retrieve-all-auteurs")
    public List<Auteur> getAuteurs() {
        List<Auteur> listAuteurs = AuteurService.retrieveAllAuteurs();
        return listAuteurs;
    }
    // http://localhost:8089/livre/auteur/retrieve-all-auteur/8
    @GetMapping("/retrieve-auteur/{auteur-id}")
    public Auteur retrieveAuteur(@PathVariable("auteur-id") Long idAuteur) {
        Auteur auteur = AuteurService.retrieveAuteur(idAuteur);
        return auteur;
    }

    @PostMapping("/add-auteur")
    public Auteur addAuteur(@RequestBody Auteur auteur) {
        return AuteurService.addAuteur(auteur);
    }

    // http://localhost:8089/livre/auteur/remove-auteur/{auteur-id}
    @DeleteMapping("/remove-auteur/{auteur-id}")
    public void deleteAuteur(@PathVariable("auteur-id") Long idAuteur) {
        AuteurService.deleteAuteur(idAuteur);
    }

    // http://localhost:8089/livre/auteur/modify-auteur
    @PutMapping("/modify-auteur")
    public Auteur modifyAuteur(@RequestBody Auteur auteur) {
        return AuteurService.modifyAuteur(auteur);
    }


}