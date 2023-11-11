package br.senac.sp.epictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.sp.epictask.repository.TaskRepository;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired //Ingecao de dependencia
    TaskRepository repository;

    @GetMapping
    public String index(Model model) {
        var lista = repository.findAll();
        model.addAttribute("tasks", lista);
        return "task/index";
    }

}
