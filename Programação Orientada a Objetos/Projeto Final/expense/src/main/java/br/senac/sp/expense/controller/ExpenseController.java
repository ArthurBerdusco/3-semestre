package br.senac.sp.expense.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.senac.sp.expense.model.Expense;
import br.senac.sp.expense.repository.ExpenseRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("expense")
public class ExpenseController {

    @Autowired
    ExpenseRepository repository;

    @GetMapping
    public String index(@RequestParam(name = "month", required = false) String date, Model model) {
        String year;
        String month;

        if (date != null) {
            // Se a data foi fornecida, extrai ano e mês da string
            year = date.substring(0, 4);
            month = date.substring(5);
        } else {
            // Caso contrário, use a data atual
            year = String.valueOf(LocalDateTime.now().getYear());
            month = String.valueOf(LocalDateTime.now().getMonthValue());
        }

        var list = repository.findByMonthAndYear(month, year);
        model.addAttribute("expenses", list);

        BigDecimal totalExpenses = new BigDecimal(0);

        // Calcule o total de despesas para o mês selecionado
        for (Expense expense : list) {
            totalExpenses = totalExpenses.add(expense.getAmount());
        }

        model.addAttribute("totalExpenses", totalExpenses);
        return "expense/index";
    }

    @GetMapping("new")
    public String form(Expense expense) {
        return "expense/form";
    }

    @PostMapping("new")
    public String save(@Valid Expense expense, BindingResult result) {
        if (result.hasErrors())
            return "expense/form";
        repository.save(expense);
        return "redirect:/expense";
    }

    @GetMapping("{id}")
    public String details(@PathVariable Long id, Model model) {
        Expense expense = repository.findById(id).orElse(null);

        if (expense == null) {
            // Adicione tratamento para despesa não encontrada
            return "redirect:/expense";
        }

        model.addAttribute("expense", expense);
        return "expense/form";
    }

    @PostMapping("{id}")
    public String save(@PathVariable Long id, @Valid Expense updatedExpense, BindingResult result) {
        if (result.hasErrors())
            return "expense/form";

        // Obter a despesa existente pelo ID
        Expense existingExpense = repository.findById(id).orElse(null);

        if (existingExpense == null)
            return "redirect:/expense";

        // Atualizar os campos da despesa existente
        existingExpense = updatedExpense;

        // Salvar a despesa atualizada no banco de dados
        repository.save(existingExpense);

        return "redirect:/expense";
    }

}
