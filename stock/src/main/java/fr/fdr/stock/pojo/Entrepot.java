package fr.fdr.stock.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Entrepot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entrepotId;
    private String adresse;
    private String nom;

}
