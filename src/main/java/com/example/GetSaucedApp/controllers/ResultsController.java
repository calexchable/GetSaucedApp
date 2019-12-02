package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "hot-sauces")
public class ResultsController {

    @Autowired
    private HotSauceDao hotSauceDao;

    @RequestMapping(value = "results", method = RequestMethod.GET)
    public String results(Model model,
                          @ModelAttribute SearchForm searchForm) {

        model.addAttribute("title", "Get Your Results!");
        model.addAttribute("searchForm", searchForm);
        return "hot-sauces/results";
    }
}
    //    @RequestMapping(value = "results")
//    public String resultingHotSauces(Model model) {
//
//        ArrayList<HotSauce> hotSauces = new ArrayList<>();
//
//        model.addAttribute("title", "Check out your search results!");
//        model.addAttribute("hotSauces", hotSauces);
//
//        SearchForm searchForm = new SearchForm();
//
//        if (searchForm.getSearchField().equals(SearchCategory.ALL)) {
//            hotSauces = hotSauceDaoImpl.findByValue(searchForm.getSearchField(), searchForm.getKeyword());
//
//        } else {
//            hotSauces = hotSauceDaoImpl.findByColumnAndValue(searchForm.getSearchField(), searchForm.getKeyword());
//        }
//
//        model.addAttribute("hotSauces", hotSauces);
//
//
//
//        return "hot-sauces/results";
//    }
//}

