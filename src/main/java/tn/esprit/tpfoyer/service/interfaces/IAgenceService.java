package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Agence;

import java.util.Set;

public interface IAgenceService {
    Agence addAgence(Agence agence);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long id);

    Agence getAgenceById(Long id);

    Set<Agence> getAllAgences();
}
