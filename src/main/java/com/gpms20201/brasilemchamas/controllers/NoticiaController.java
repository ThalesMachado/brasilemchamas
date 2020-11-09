package com.gpms20201.brasilemchamas.controllers;

import com.gpms20201.brasilemchamas.Entities.Noticia;
import com.gpms20201.brasilemchamas.Repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/n")
public class NoticiaController {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @RequestMapping(value = { "", "/index" })
    public String indexNoticia(Model modelo) {
        modelo.addAttribute("titulo", "Notícias");
        return "Noticia/index";
    }
}
