package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Vehicule;
import tn.esprit.tpfoyer.service.interfaces.IVehiculeService;

import java.util.Set;

@RestController
@RequestMapping("vehicule")
@AllArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/ajouter")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping("/modifier")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerVehicule(@PathVariable("id") Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable("id") Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping("/all")
    public Set<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }
}
