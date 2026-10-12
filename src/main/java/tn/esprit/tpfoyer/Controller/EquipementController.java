package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Equipement;
import tn.esprit.tpfoyer.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@RequestMapping("equipement")
@AllArgsConstructor
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/ajouter")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @PutMapping("/modifier")
    public Equipement modifierEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerEquipement(@PathVariable("id") Long id) {
        equipementService.deleteEquipement(id);
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable("id") Long id) {
        return equipementService.getEquipementById(id);
    }

    @GetMapping("/all")
    public Set<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }
}
