package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
