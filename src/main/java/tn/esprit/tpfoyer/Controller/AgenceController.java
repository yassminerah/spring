package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Agence;
import tn.esprit.tpfoyer.service.interfaces.IAgenceService;

import java.util.Set;

@RestController
@RequestMapping("agence")
@AllArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/ajouter")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PutMapping("/modifier")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerAgence(@PathVariable("id") Long id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable("id") Long id) {
        return agenceService.getAgenceById(id);
    }

    @GetMapping("/all")
    public Set<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }
}
