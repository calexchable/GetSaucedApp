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

//TODO: WRITE CONTROLLER TO ACCESS AND INPUT THE THINGS.
    // HOT SAUCES
    // Request Path to index: /hot-sauces
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("hotSauces", hotSauceDao.findAll());
        model.addAttribute("title", "Get Sauced!");

        return "hot-sauces/index";
    }

    // Request path to search: /hot-sauces/search

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchHotSauces(@ModelAttribute @Valid SearchForm searchForm,
                                  Errors errors,
                                  Model model) {
        model.addAttribute("title", "Search the Sauces!");

        if (errors.hasErrors()){
            model.addAttribute("title", "Search the Sauces!");
            return "hot-sauces/search";
        }

        return "redirect:/hot-sauces/results";
    }

    @RequestMapping(value = "results", method = RequestMethod.GET)

    public String resultsHotSauces(@ModelAttribute @Valid SearchForm searchForm,
                                   Model model, @RequestParam String searchTerm) {
        model.addAttribute("title", "Search Results");
        model.addAttribute("searchTerm", searchTerm);

        return "hot-sauces/results";
    }

//TODO Add a section for CASERA or Homemade sauces.
    //This will have location and attempt to have recipes.


}


