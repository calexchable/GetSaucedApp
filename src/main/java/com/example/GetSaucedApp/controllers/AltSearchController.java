package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "hot-sauces")
public class AltSearchController {

    private HotSauceData hotSauceData = HotSauceData.getSauceInstance();

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces (Model model) {
        model.addAttribute("title", "Search the Sauces!");
        model.addAttribute(new SearchForm());

        return "hot-sauces/search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String searchHotSauces(@ModelAttribute @Valid SearchForm searchForm,
                                  Model model,
                                  Errors errors) {
        model.addAttribute("title", "Search the Sauces!");

        if (errors.hasErrors()){
            model.addAttribute("title", "Try Searching the Sauces Again!");

            return "hot-sauce/search";
        }

        return "redirect:results";
    }

    @RequestMapping(value = "results")
    public String searchHotSauces(Model model,
                         @ModelAttribute SearchForm searchForm) {

        ArrayList<Job> jobs;

        if (searchForm.getSearchField().equals(JobFieldType.ALL)) {
            jobs = jobData.findByValue(searchForm.getKeyword());
        } else {
            jobs = jobData.findByColumnAndValue(searchForm.getSearchField(), searchForm.getKeyword());
        }

        model.addAttribute("jobs", jobs);

        return "search";
    }

}