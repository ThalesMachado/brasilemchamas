package com.gpms20201.brasilemchamas.controllers;

import com.gpms20201.brasilemchamas.Entities.Noticia;
import com.gpms20201.brasilemchamas.Repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private NoticiaRepository noticiaRepository;

    @RequestMapping("/")
    public String index() {

        return "Index/home";
    }
}
