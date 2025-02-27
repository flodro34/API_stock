package fr.fdr.stock.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produit_id;

    @Size(min = 5, max = 50, message = "la taille doit être entre 10 et 50")
    private String nom;

    private String description;
    private Float prix;
    private Integer quantite;


    public Produit(String nom, String description, Float prix, Integer quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Produit() {}

    public Long getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(Long produit_id) {
        this.produit_id = produit_id;
    }

    public @Size(min = 5, max = 50, message = "la taille doit être entre 10 et 50") String getNom() {
        return nom;
    }

    public void setNom(@Size(min = 5, max = 50, message = "la taille doit être entre 10 et 50") String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
}
