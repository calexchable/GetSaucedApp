package com.example.GetSaucedApp.controllers;
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

@Controller
@RequestMapping(value = "hot-sauces")
public class SearchController {

    @Autowired
    private HotSauceDao hotSauceDao;

    private SearchForm searchForm;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces(Model model) {
        model.addAttribute("title", "Search the Sauces!");
        model.addAttribute(new SearchForm());

        return "hot-sauces/search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchHotSauces(@ModelAttribute @Valid SearchForm newSearchForm,
                                  Errors errors,
                                  Model model) {

        model.addAttribute("title", "Search the Sauces!");

        if (errors.hasErrors()) {
            model.addAttribute("title", "Try Searching the Sauces Again!");

            return "hot-sauces/search";
        }

        return "redirect:results";
    }
}
