package com.gpms20201.brasilemchamas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ap")
public class AreasProtegidasController {
    @RequestMapping("")
    public String areasProtegidas(Model modelo) {
        modelo.addAttribute("titulo", "Áreas Protegidas | br em chamas");
        return "AreasProtegidas/areasProtegidas.html";
    }
}
