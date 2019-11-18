package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "hot-sauces")
public class SearchController {

    @Autowired
    private HotSauceDao hotSauceDao;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces(Model model) {
        model.addAttribute("title", "Search the Sauces!");

        return "hot-sauces/search";
    }
}
