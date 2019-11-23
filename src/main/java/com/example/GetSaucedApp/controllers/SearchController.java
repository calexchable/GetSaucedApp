package com.example.GetSaucedApp.controllers;
import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchCategory;
import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import com.example.GetSaucedApp.models.data.HotSauceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "hot-sauces")
public class SearchController {

    @Autowired
    private HotSauceDao hotSauceDao;

    private HotSauceData hotSauceData = HotSauceData.getSauceInstance();

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces(Model model) {
        model.addAttribute("title", "Search the Sauces!");
        model.addAttribute(new SearchForm());

        return "hot-sauces/search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchHotSauces(@ModelAttribute @Valid SearchForm searchForm,
                                  Errors errors,
                                  Model model) {
        model.addAttribute("title", "Search the Sauces!");

        if (errors.hasErrors()) {
            model.addAttribute("title", "Try Searching the Sauces Again!");

            return "hot-sauces/search";
        }

        return "redirect:results";
    }

    @RequestMapping(value = "results")
    public String resultsHotSauces(Model model,
                                   @ModelAttribute SearchForm searchForm) {

        ArrayList<HotSauce> hotSauces;

        if (searchForm.getSearchField().equals(SearchCategory.ALL)) {
            hotSauces = HotSauceData.findByValue(searchForm.getKeyword());
        }

        model.addAttribute("title", "Search Results");
        model.addAttribute("hotSauces", hotSauces);

        return "hot-sauces/results";
    }
}
