package tn.esprit.tpfoyer.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Client;
import tn.esprit.tpfoyer.service.interfaces.IClientService;

import java.util.Set;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/modifier")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerClient(@PathVariable("id") Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable("id") Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/all")
    public Set<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
