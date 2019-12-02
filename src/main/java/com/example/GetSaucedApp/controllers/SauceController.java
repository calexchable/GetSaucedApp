package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Christopher Alex Chable'
 */

@Controller
@RequestMapping(value = "hot-sauces")
public class SauceController {

    @Autowired
    private HotSauceDao hotSauceDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("hotSauces", hotSauceDao.findAll());
        model.addAttribute("title", "Get Sauced!");

        return "hot-sauces/index";
    }
}


