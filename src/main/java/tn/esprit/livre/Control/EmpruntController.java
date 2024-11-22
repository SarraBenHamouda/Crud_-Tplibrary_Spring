package tn.esprit.livre.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.livre.Entity.Emprunt;
import tn.esprit.livre.Services.IEmpruntService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/emprunt")
public class EmpruntController {

    private final IEmpruntService empruntService;

    // Endpoint to retrieve all emprunts
    @GetMapping("/retrieve-all-emprunts")
    public List<Emprunt> getEmprunts() {
        return empruntService.retrieveAllEmprunts();
    }

    // Endpoint to retrieve a specific emprunt by ID
    @GetMapping("/retrieve-emprunt/{id}")
    public Emprunt retrieveEmprunt(@PathVariable("id") Long id) {
        return empruntService.retrieveEmprunt(id);
    }

    // Endpoint to add a new emprunt
    @PostMapping("/add-emprunt")
    public Emprunt addEmprunt(@RequestBody Emprunt emprunt) {
        return empruntService.addEmprunt(emprunt);
    }

    // Endpoint to delete an emprunt by ID
    @DeleteMapping("/remove-emprunt/{id}")
    public void deleteEmprunt(@PathVariable("id") Long id) {
        empruntService.deleteEmprunt(id);
    }

    // Endpoint to modify an existing emprunt
    @PutMapping("/modify-emprunt")
    public Emprunt modifyEmprunt(@RequestBody Emprunt emprunt) {
        return empruntService.modifyEmprunt(emprunt);
    }
}
