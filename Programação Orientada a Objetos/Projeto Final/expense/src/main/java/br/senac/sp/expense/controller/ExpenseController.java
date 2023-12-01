package br.senac.sp.expense.controller;

import java.math.BigDecimal;
import java.util.List;

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
    public String index(@RequestParam(name = "month", required = false) String date,
            @RequestParam(name = "category", required = false) String category,
            @RequestParam(name = "amount", required = false) BigDecimal amount,
            @RequestParam(name = "amountOperator", required = false) String amountOperator,
            Model model) {

        List<Expense> list;

        if (date != null && !date.isEmpty()) {
            String year = date.substring(0, 4);
            String month = date.substring(5);
            list = repository.findByMonthAndYear(month, year);
        } else if (category != null && !category.isEmpty() && !category.equals("Selecione")) {
            list = repository.findByCategory(category);
        } else if (amount != null && amountOperator != null) {
            System.out.println("Entrei auqi");
            if ("EQUAL".equals(amountOperator)) {
                list = repository.findByAmount(amount);
            } else if ("GREATER_THAN_OR_EQUAL".equals(amountOperator)) {
                list = repository.findByAmountGreaterThanEqual(amount);
            } else if ("LESS_THAN_OR_EQUAL".equals(amountOperator)) {
                list = repository.findByAmountLessThanEqual(amount);
            } else {
                list = repository.findAllByOrderByDateAsc();
            }
        } else {
            list = repository.findAllByOrderByDateAsc();
        }

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

    @DeleteMapping("{id}") // /expense/2
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/expense";
    }

}
