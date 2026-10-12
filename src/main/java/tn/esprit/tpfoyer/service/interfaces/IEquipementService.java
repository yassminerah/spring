package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Equipement;

import java.util.Set;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);

    Equipement updateEquipement(Equipement equipement);

    void deleteEquipement(Long id);

    Equipement getEquipementById(Long id);

    Set<Equipement> getAllEquipements();
}
