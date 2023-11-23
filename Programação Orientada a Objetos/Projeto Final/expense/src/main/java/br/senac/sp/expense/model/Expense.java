package br.senac.sp.expense.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class Expense {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull(message = "A data não pode ser nula")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date date;

    String description;

    @Pattern(regexp = "(?!^Selecione$).*", message = "Você deve selecionar uma categoria válida")
    String category;

    @Pattern(regexp = "(?!^Selecione$).*", message = "Você deve selecionar o tipo de pagamento")
    String typePayment;

    @NotNull(message = "O valor não pode ser nulo")
    @Min(value = 0, message = "não pode ser negativo")
    BigDecimal amount;

}
