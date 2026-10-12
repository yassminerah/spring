package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Maintenance;
import tn.esprit.tpfoyer.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@RequestMapping("maintenance")
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/ajouter")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @PutMapping("/modifier")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerMaintenance(@PathVariable("id") Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable("id") Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @GetMapping("/all")
    public Set<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }
}
