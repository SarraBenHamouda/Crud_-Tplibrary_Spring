package tn.esprit.livre.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livre.Entity.Bibliotheque;
import tn.esprit.livre.Services.IBibliothequeService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bibliotheque")
public class BibliothequeController {

    IBibliothequeService BibliothequeService;
    // http://localhost:8089/livre/bibliotheque/retrieve-all-bibliotheques
    @GetMapping("/retrieve-all-bibliotheques")
    public List<Bibliotheque> getBibliotheques() {
        List<Bibliotheque> listBibliotheques = BibliothequeService.retrieveAllBibliotheques();
        return listBibliotheques;
    }
    // http://localhost:8089/livre/bibliotheque/retrieve-all-bibliotheque/8
    @GetMapping("/retrieve-bibliotheque/{bibliotheque-id}")
    public Bibliotheque retrieveBibliotheque(@PathVariable("bibliotheque-id") Long idBibliotheque) {
        Bibliotheque bibliotheque = BibliothequeService.retrieveBibliotheque(idBibliotheque);
        return bibliotheque;
    }

    @PostMapping("/add-bibliotheque")
    public Bibliotheque addBibliotheque(@RequestBody Bibliotheque bibliotheque) {
        return BibliothequeService.addBibliotheque(bibliotheque);
    }

    // http://localhost:8089/livre/bibliotheque/remove-bibliotheque/{bibliotheque-id}
    @DeleteMapping("/remove-auteur/{bibliotheque-id}")
    public void deleteBibliotheque(@PathVariable("bibliotheque-id") Long idBibliotheque) {
        BibliothequeService.deleteBibliotheque(idBibliotheque);
    }

    // http://localhost:8089/livre/bibliotheque/modify-bibliotheque
    @PutMapping("/modify-bibliotheque")
    public Bibliotheque modifyBibliotheque(@RequestBody Bibliotheque bibliotheque) {
        return BibliothequeService.modifyBibliotheque(bibliotheque);
    }


}