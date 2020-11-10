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
    public String indexNoticia(Model modelo, @PathParam("caminho") String caminho) {
        if (caminho != null) {
            Noticia noticia = noticiaRepository.findByCaminho(caminho);
            modelo.addAttribute("titulo", noticia.getTitulo());
            modelo.addAttribute("noticia", noticia);
            return "Noticia/reportagem.html";
        } else {
            List<Noticia> noticias = noticiaRepository.findAll();
            modelo.addAttribute("noticiaPrincipal", noticias.get(0));
            modelo.addAttribute("noticias", noticias);
            modelo.addAttribute("titulo", "Notícias");
            return "Noticia/index.html";
        }
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
