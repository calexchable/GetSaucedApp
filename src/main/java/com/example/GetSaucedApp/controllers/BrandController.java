package com.example.GetSaucedApp.controllers;


import com.example.GetSaucedApp.models.Brand;
import com.example.GetSaucedApp.models.data.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandDao brandDao;

    //TODO ADD BRAND INDEX HANDLER
    //BRANDS
    //Request path to index: /brands
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("brands", brandDao.findAll());
        model.addAttribute("title", "Brands");

        return "brands/index";
    }

    //Request path to add new brands: /brands/add

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addBrands(Model model) {
        model.addAttribute("title", "Add A Brand");
        model.addAttribute("brand", new Brand());

        return "brands/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addBrands(@ModelAttribute @Valid Brand brand,
                               Errors errors) {

        if (errors.hasErrors()){
            return "brands/add";
        }

        brandDao.save(brand);
        return "redirect:";
    }
}
