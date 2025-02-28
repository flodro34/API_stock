package fr.fdr.stock.service.impl;

import fr.fdr.stock.pojo.LogStock;
import fr.fdr.stock.repository.LogStockRepository;
import fr.fdr.stock.service.LogStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogStockServiceImpl implements LogStockService {

    @Autowired
    private LogStockRepository logStockRepository;

    @Override
    public void createLogStock(LogStock logStock) {

    }
}
