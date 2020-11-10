package com.gpms20201.brasilemchamas.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import com.gpms20201.brasilemchamas.Entities.Noticia;
import com.gpms20201.brasilemchamas.Repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/n")
public class NoticiaController {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @RequestMapping(value = { "", "/index" })
    public String indexNoticia(Model modelo) {
        List<Noticia> noticiasPrincipais = noticiaRepository.findAll();
        modelo.addAttribute("titulo", "Notícias");
        modelo.addAttribute("noticias", noticiasPrincipais);
        return "Noticia/index";
    }

    @GetMapping("cadastrar")
    public String cadastrarNotica(Model modelo, @PathParam("caminho") String caminho,
            @PathParam("titulo") String titulo, @PathParam("corpo") String corpo,
            @PathParam("urlImagem") String urlImagem) {
        if (titulo != null && corpo != null && urlImagem != null && caminho != null) {
            noticiaRepository.save(new Noticia(titulo, corpo, urlImagem, caminho));
            return "Noticia/cadastrar.html";
        }
        return "Noticia/cadastrar.html";

    }
}
