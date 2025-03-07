package fr.fdr.stock.service;


import fr.fdr.stock.pojo.Produit;

import java.util.List;

public interface ProduitService {

    List<Produit> getAllProduit();

    void createProduit(Produit produit);

    void updateProduit(Long id, Produit produit);

    Produit getProduitById(Long id);

    void deleteProduitById(Long id);

    void updateProduitQuantity(Long produitId, Integer quantite);

}
