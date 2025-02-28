package fr.fdr.stock.manager;

import fr.fdr.stock.pojo.LogStock;
import fr.fdr.stock.pojo.Produit;
import fr.fdr.stock.repository.ProduitRepository;
import fr.fdr.stock.service.LogStockService;
import fr.fdr.stock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogStockManager {

    @Autowired
    private ProduitService produitService;

    @Autowired
    private LogStockService logStockService;

    public void processLog(LogStock logStock) {
        //1. intregration du log
        this.logStockService.createLogStock(logStock);

        //2. Mise ne place de la modif
        switch(logStock.getAction()){
            case MODIFICATION -> {
                this.produitService.updateProduitQuantity(
                        logStock.getProduit_id(), logStock.getQuantite()
                );
                break;
            }
            case SUPPRESSION -> {
                this.produitService.deleteProduitById(logStock.getProduit_id());
                break;
            }

        }
    }


}
