package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
