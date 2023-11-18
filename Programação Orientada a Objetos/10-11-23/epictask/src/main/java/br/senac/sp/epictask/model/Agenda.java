package br.senac.sp.epictask.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//Builerplate - codigo repetitivo - contrutor getter setter / @Data
//ORM (converte db em java e java em db)- JPA 
@Entity
@Data
public class Agenda {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String nome;
    Date data;
    LocalDateTime hora;

}
