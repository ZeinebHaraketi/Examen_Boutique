package tn.esprit.boutique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boutique.Entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
