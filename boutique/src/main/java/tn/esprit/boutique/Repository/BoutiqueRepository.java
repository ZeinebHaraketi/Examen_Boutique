package tn.esprit.boutique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boutique.Entities.Boutique;

public interface BoutiqueRepository extends JpaRepository<Boutique,Long> {
}
