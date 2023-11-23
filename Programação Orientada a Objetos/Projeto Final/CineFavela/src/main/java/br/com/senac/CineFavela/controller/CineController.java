package br.com.senac.CineFavela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senac.CineFavela.repository.CineRepository;


@Controller
@RequestMapping("cinema")
public class CineController {

    @Autowired
    CineRepository repository;

    @GetMapping
    public String index(Model model) {
        var lista = repository.findAll();
        model.addAttribute("salas", lista);
        return "cinema/index";
    }

}
