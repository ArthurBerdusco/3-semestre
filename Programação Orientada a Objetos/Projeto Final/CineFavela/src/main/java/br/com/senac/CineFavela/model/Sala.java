package br.com.senac.CineFavela.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long sala_id;

    Integer numero;

    @ElementCollection
    @CollectionTable(name = "cadeiras", joinColumns = @JoinColumn(name = "sala_id"))
    List<Cadeira> cadeiras;

}
