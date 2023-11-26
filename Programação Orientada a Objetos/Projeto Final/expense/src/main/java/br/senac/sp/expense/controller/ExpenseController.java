package br.senac.sp.expense.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
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
            year = date.substring(0, 4);
            month = date.substring(5);
        } else {
            year = null;
            month =null;
        }
        var list = repository.findByMonthAndYear(month, year);
        model.addAttribute("expenses", list);

        BigDecimal totalExpenses = new BigDecimal(0);

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

    @DeleteMapping("{id}")// /expense/2
    public String delete(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/expense"; 
    }

}
