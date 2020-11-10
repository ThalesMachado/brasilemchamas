package com.gpms20201.brasilemchamas.controllers;

import java.util.Map;

import javax.websocket.server.PathParam;

import com.gpms20201.brasilemchamas.Entities.FaleConosco;
import com.gpms20201.brasilemchamas.Repositories.FaleConoscoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fc")
public class FaleConoscoController {

    @Autowired
    private FaleConoscoRepository faleConoscoRepository;

    @RequestMapping("")
    public String faleConosco(Model modelo, @PathParam("nome") String nome, @PathParam("email") String email,
            @PathParam("mensagem") String mensagem) {
        if (nome != null && email != null && mensagem != null) {
            FaleConosco faleConosco = faleConoscoRepository.save(new FaleConosco(nome, email, mensagem));
            modelo.addAttribute("sucesso", true);
            modelo.addAttribute("titulo", "Fale Conosco");
            return "faleConosco/faleConosco.html";

        }
        modelo.addAttribute("titulo", "Fale Conosco");
        return "faleConosco/faleConosco.html";
    }
}
