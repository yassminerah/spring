package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Employe;
import tn.esprit.tpfoyer.service.interfaces.IEmployeService;

import java.util.Set;

@RestController
@RequestMapping("employe")
@AllArgsConstructor
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/ajouter")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @PutMapping("/modifier")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerEmploye(@PathVariable("id") Long id) {
        employeService.deleteEmploye(id);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable("id") Long id) {
        return employeService.getEmployeById(id);
    }

    @GetMapping("/all")
    public Set<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }
}
