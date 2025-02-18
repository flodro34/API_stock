package fr.fdr.stock.service.impl;

import fr.fdr.stock.pojo.Produit;
import fr.fdr.stock.repository.ProduitRepository;
import fr.fdr.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit() {
        return this.produitRepository.findAll();
    }
}
