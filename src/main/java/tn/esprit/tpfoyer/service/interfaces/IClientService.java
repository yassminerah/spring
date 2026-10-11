package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);

    Client updateClient(Client client);

    void deleteClient(Long id);

    Client getClientById(Long id);

    List<Client> getAllClients();
}
