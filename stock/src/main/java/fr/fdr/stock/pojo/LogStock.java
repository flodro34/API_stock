package fr.fdr.stock.pojo;

import fr.fdr.stock.pojo.state.Action;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name="log")
public class LogStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private Action action;

    private Long produit_id;

    private Integer quantite;

    public LogStock(LocalDateTime date, Action action, Long produit_id, Integer quantite) {
        this.date = date;
        this.action = action;
        this.produit_id = produit_id;
        this.quantite = quantite;
    }

    public LogStock() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Long getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(Long produit_id) {
        this.produit_id = produit_id;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
}
