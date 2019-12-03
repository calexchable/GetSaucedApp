package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import com.example.GetSaucedApp.models.data.HotSauceDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "hot-sauces")
public class ResultsController {

    @Autowired
    private HotSauceDao hotSauceDao;

    private HotSauceDaoImpl hotSauceDaoImpl;

    @RequestMapping(value = "results", method = RequestMethod.GET)
    public String results(Model model,
                          @ModelAttribute SearchForm searchForm) {

        ArrayList<HotSauce> hotSauces = new ArrayList<>();

// Currently this function is turned off //
// at the results page -- turned off option //
//        if (searchForm.getSearchField().equals("all")) {
//            hotSauces = hotSauceDaoImpl.findByValue(searchForm.getKeyword());
//
//        } else



        if (searchForm.getSearchField().equals("brand")) {
            hotSauces = hotSauceDaoImpl.findByBrand(searchForm.getKeyword());

//        }

        } else if (searchForm.getSearchField().equals("name")) {
            hotSauces = hotSauceDaoImpl.findByName(searchForm.getKeyword());

        } else
//            if (searchForm.getSearchField().equals("description"))
            {
            hotSauces = hotSauceDaoImpl.findByDescription(searchForm.getKeyword());

        }

        model.addAttribute("title", "Check Out Your Results!");
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("hotSauces", hotSauces);

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

