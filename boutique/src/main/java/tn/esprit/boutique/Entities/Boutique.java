package tn.esprit.boutique.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Setter(AccessLevel.NONE)
    Long id;
    String nom;
    @Enumerated(EnumType.STRING)
    Categorie categorie;

    @ManyToOne
    CentreCommercial centreCommercial;

    @JsonIgnore
    @ManyToMany
    Set<Client> clients=new HashSet<>();
}
