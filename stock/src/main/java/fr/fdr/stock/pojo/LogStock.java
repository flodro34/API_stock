package fr.fdr.stock.pojo;

import fr.fdr.stock.pojo.state.Action;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="log")
public class LogStock {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING) // pour que en base soit ecrit la valeur et pas sa place ordinale
    private Action action;

    private Long ProduitId;

    private Long quantite;


}
