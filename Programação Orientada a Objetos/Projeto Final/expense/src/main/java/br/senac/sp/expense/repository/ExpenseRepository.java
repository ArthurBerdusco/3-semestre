package br.senac.sp.expense.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senac.sp.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT e FROM Expense e WHERE YEAR(e.date) = :year AND MONTH(e.date) = :month")
    List<Expense> findByMonthAndYear(@Param("month") String month, @Param("year") String year);

    List<Expense> findAllByOrderByDateAsc();

    List<Expense> findByCategory(String category);

    List<Expense> findByAmount(BigDecimal amount);

    List<Expense> findByAmountGreaterThanEqual(BigDecimal amount);

    List<Expense> findByAmountLessThanEqual(BigDecimal amount);

    
}
