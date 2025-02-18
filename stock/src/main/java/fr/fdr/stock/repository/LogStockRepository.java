package fr.fdr.stock.repository;

import fr.fdr.stock.pojo.LogStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogStockRepository extends JpaRepository<LogStock, Long> {
}
