package br.com.senac.CineFavela.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Cadeira {
    Integer numero;
    boolean ocupada;
}
