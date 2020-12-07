package com.gpms20201.brasilemchamas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mq")
public class MapaQueimadasController {

    @RequestMapping(value = { "", "/index" })
    public String index(Model modelo) {

        modelo.addAttribute("titulo", "Mapa das Queimadas");

        return "mapaQueimadas/mapa.html";
    }

}
