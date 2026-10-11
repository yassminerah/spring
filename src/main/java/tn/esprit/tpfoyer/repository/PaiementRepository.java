package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
