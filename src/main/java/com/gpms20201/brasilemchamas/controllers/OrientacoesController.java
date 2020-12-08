package com.gpms20201.brasilemchamas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/or")
public class OrientacoesController {
    @RequestMapping("")
    public String orientacoes(Model modelo) {
        modelo.addAttribute("titulo", "Orientações | br em chamas");
        return "Orientacoes/orientacoes.html";
    }
}
