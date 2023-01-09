package tn.esprit.boutique.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.boutique.Entities.CentreCommercial;
import tn.esprit.boutique.Service.ServiceAll;

@RestController
@RequestMapping("")
@AllArgsConstructor
public class AllController {

    private final ServiceAll serviceAll;

    @PostMapping("ajoutCentre")
    void ajoutCentre(@RequestBody CentreCommercial centre){
        serviceAll.ajoutCentre(centre);
    }
}
