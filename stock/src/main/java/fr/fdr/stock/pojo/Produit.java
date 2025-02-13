package fr.fdr.stock.pojo;

import lombok.Data;

@Data
public class Produit {

    private Long produitId;
    private String nom;
    private String description;
    private Float prix;
    private Integer quantite;

}
