package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.SearchForm;
import com.example.GetSaucedApp.models.data.HotSauceDao;
import com.example.GetSaucedApp.models.data.HotSauceDaoImpl;
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

//    @Autowired
    private HotSauceDaoImpl hotSauceDaoImpl;

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchHotSauces(Model model) {
        model.addAttribute("title", "Search the Sauces!");
        model.addAttribute(new SearchForm());

        return "hot-sauces/search";
    }
}

//    @RequestMapping(value = "search", method = RequestMethod.POST)
//    public String searchHotSauces(@ModelAttribute @Valid SearchForm searchForm,
//                                  Errors errors,
//                                  Model model) {
//
//        ArrayList<HotSauce> hotSauces = new ArrayList<>();
//
//        model.addAttribute("title", "Search the Sauces!");
//        model.addAttribute(new SearchForm());
//        model.addAttribute("hotSauces", hotSauces);
//
//        if (errors.hasErrors()) {
//            model.addAttribute("title", "Try Searching the Sauces Again!");
//            return "hot-sauces/search";
//
//        }
//        else {
//
//            if (searchForm.getSearchField().equals(SearchCategory.ALL)) {
//                hotSauceDaoImpl.findByValue(searchForm.getSearchField(), searchForm.getKeyword());
//            } else {
//                hotSauceDaoImpl.findByColumnAndValue(searchForm.getSearchField(), searchForm.getKeyword());
//            }


//        }
//
//
//        return "redirect:results";
//    }}
//
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