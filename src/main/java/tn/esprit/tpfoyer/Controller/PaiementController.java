package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Paiement;
import tn.esprit.tpfoyer.service.interfaces.IPaiementService;

import java.util.Set;

@RestController
@RequestMapping("paiement")
@AllArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping("/ajouter")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @PutMapping("/modifier")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerPaiement(@PathVariable("id") Long id) {
        paiementService.deletePaiement(id);
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable("id") Long id) {
        return paiementService.getPaiementById(id);
    }

    @GetMapping("/all")
    public Set<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }
}
