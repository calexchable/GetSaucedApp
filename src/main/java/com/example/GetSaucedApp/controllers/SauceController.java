package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by Christopher Alex Chable'
 */

@Controller
@RequestMapping(value = "hot-sauces")
public class SauceController {

    @Autowired
    private HotSauceDao hotSauceDao;
    
    // HOT SAUCES
    // Request Path to index: /hot-sauces
    @RequestMapping(value = "", method =RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("hotSauces", hotSauceDao.findAll());
        model.addAttribute("title", "Get Sauced!");

        return "hot-sauces/index";
    }

//TODO Add a section for CASERA or Homemade sauces.
    //This will have location and attempt to have recipes.


}


