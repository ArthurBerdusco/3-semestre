package br.senac.sp.epictask.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

//Builerplate - codigo repetitivo - contrutor getter setter / @Data
// ORM (converte db em java e java em db)- JPA 
@Entity
@Data
public class Task {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String title;

    // not null = nao preencher
    // not empty = "   "
    // not blank = ""

    @Size(min = 10, message="digite uma descrição com pelo menos 10 caracteres")
    String description;

    @Min(value = 1, message="não pode ser negativo")
    Integer score;

}
