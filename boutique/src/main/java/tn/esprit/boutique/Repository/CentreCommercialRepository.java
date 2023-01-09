package tn.esprit.boutique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boutique.Entities.CentreCommercial;

public interface CentreCommercialRepository extends JpaRepository<CentreCommercial,Long> {
}
