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
@RequestMapping("noticias")
public class NoticiaController {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @GetMapping("{caminho}")
    public String noticiaViaCaminho(@PathVariable("caminho") String caminho, Model model) {
        Noticia noticia = noticiaRepository.findByCaminho(caminho);
        model.addAttribute("noticia", noticia);
        return "Noticia/single";
    }
}
