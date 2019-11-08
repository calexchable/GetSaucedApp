package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Christopher Alex Chable'
 */

@Controller
@RequestMapping(value = "hot-sauces")
public class SauceController {

    @Autowired
    private HotSauceDao hotSauceDao;

//TODO: WRITE CONTROLLER TO ACCESS AND INPUT THE THINGS.
    // HOT SAUCES
    // Request Path to index: /hot-sauces
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("hotSauces", hotSauceDao.findAll());
        model.addAttribute("title", "Get Sauced!");

        return "hot-sauces/index";
    }

    // Request Path to add hot sauces: /hot-sauce/add

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addHotSauces(Model model) {
        model.addAttribute("title", "Add Hot Sauce");
        model.addAttribute(new HotSauce());

        return "hot-sauces/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addHotSauces(@ModelAttribute @Valid HotSauce newHotSauce,
                               Errors errors,
                               Model model)
    {
        if (errors.hasErrors()){
            model.addAttribute("title", "Add Hot Sauce");
            return "hot-sauces/add";
        }

        hotSauceDao.save(newHotSauce);
        return "redirect:";
    }

    // Request path to search: /hot-sauces/search

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces(Model model) {
        model.addAttribute("title", "Search the Sauces");

        return "hot-sauces/search";
    }

//TODO Add a section for CASERA or Homemade sauces.
    //This will have location and attempt to have recipes.
}


