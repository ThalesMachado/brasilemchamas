package com.gpms20201.brasilemchamas.controllers;

import com.gpms20201.brasilemchamas.Entities.Noticia;
import com.gpms20201.brasilemchamas.Repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("n")
public class NoticiaController {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @GetMapping("/")
    public String index() {
        return "Noticia/index";
    }

    @GetMapping("{c}")
    public String noticiaViaCaminho(@PathVariable("c") String caminho, Model model) {
        Noticia noticia = noticiaRepository.findByCaminho(caminho);
        if (noticia != null) {
            model.addAttribute("noticia", noticia);
            return "Noticia/single";
        }
        return "404";
    }
}
