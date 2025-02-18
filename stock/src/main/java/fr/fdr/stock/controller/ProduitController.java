package fr.fdr.stock.controller;

import fr.fdr.stock.pojo.Produit;
import fr.fdr.stock.service.ProduitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @PostMapping
    public void createProduit(@Valid @RequestBody Produit produit) {}

    @GetMapping
    public List<Produit> getAllProduits() {
        return this.produitService.getAllProduit();
    }


}
