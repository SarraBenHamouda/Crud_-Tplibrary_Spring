package tn.esprit.livre.Control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livre.Entity.Livre;
import tn.esprit.livre.Services.ILivreService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/livre")
public class LivreController {

    @Autowired
    private ILivreService LivreService;

    // Get all livres
    @GetMapping("/retrieve-all-livres")
    public List<Livre> getLivres() {
        return LivreService.retrieveAllLivres();
    }

    // Get livre by ID
    @GetMapping("/retrieve-livre/{livre-id}")
    public Livre retrieveLivre(@PathVariable("livre-id") Long idLivre) {
        return LivreService.retrieveLivre(idLivre);
    }

    // Add a new livre
    @PostMapping("/add-livre")
    public Livre addLivre(@RequestBody Livre livre) {
        return LivreService.addLivre(livre);
    }

    // Delete livre by ID
    @DeleteMapping("/remove-livre/{livre-id}")
    public void deleteLivre(@PathVariable("livre-id") Long idLivre) {
        LivreService.deleteLivre(idLivre);
    }

    // Modify an existing livre
    @PutMapping("/modify-livre")
    public Livre modifyLivre(@RequestBody Livre livre) {
        return LivreService.modifyLivre(livre);
    }
}
