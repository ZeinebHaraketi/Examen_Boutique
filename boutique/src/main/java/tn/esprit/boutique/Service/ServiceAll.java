package tn.esprit.boutique.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boutique.Entities.Boutique;
import tn.esprit.boutique.Entities.CentreCommercial;
import tn.esprit.boutique.Repository.BoutiqueRepository;
import tn.esprit.boutique.Repository.CentreCommercialRepository;
import tn.esprit.boutique.Repository.ClientRepository;

import java.util.List;
import java.util.Set;

@Service @AllArgsConstructor
public class ServiceAll implements IService{

    private final BoutiqueRepository boutiqueRepository;
    private final CentreCommercialRepository centreCommercialRepository;
    private final ClientRepository clientRepository;

    public void ajoutCentre(CentreCommercial centre){
        centreCommercialRepository.save(centre);

    }

    void ajouterEtAffecterlisteBoutiques (List<Boutique> lb, Long idCentre){
        CentreCommercial centreCommercial=centreCommercialRepository.findById(idCentre).orElse(null);
        /*for (Boutique boutique:lb)
        {
            boutique.setCentreCommercial(centreCommercial);
            boutiqueRepository.save(boutique);
        }*/
        boutiqueRepository.saveAll(lb);
    }



}
