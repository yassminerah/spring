package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement, Long> {
}
