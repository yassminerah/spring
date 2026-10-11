package tn.esprit.tpfoyer.service.interfaces;

import tn.esprit.tpfoyer.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);

    Paiement updatePaiement(Paiement paiement);

    void deletePaiement(Long id);

    Paiement getPaiementById(Long id);

    List<Paiement> getAllPaiements();
}
