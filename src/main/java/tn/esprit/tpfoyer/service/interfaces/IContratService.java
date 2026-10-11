package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat contrat);

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long id);

    Contrat getContratById(Long id);

    List<Contrat> getAllContrats();
}
