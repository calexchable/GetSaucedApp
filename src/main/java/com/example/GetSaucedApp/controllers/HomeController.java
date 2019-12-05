package com.example.GetSaucedApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Get Sauced!");

        return "hot-sauces/home";
    }
}