package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Contrat;
import tn.esprit.tpfoyer.service.interfaces.IContratService;

import java.util.Set;

@RestController
@RequestMapping("contrat")
@AllArgsConstructor
public class ContratController {

    private final IContratService contratService;

    @PostMapping("/ajouter")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @PutMapping("/modifier")
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerContrat(@PathVariable("id") Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable("id") Long id) {
        return contratService.getContratById(id);
    }

    @GetMapping("/all")
    public Set<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }
}
