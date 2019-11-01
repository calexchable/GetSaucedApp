package com.example.GetSaucedApp.controllers;

import com.example.GetSaucedApp.models.Brand;
import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.data.BrandDao;
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
import java.util.Optional;

/**
 * Created by Christopher Alex Chable'
 */

@Controller
@RequestMapping("hot-sauce")
public class SauceController {

    @Autowired
    private HotSauceDao hotSauceDao;

    @Autowired
    private BrandDao brandDao;

//TODO: WRITE CONTROLLER TO ACCESS AND INPUT THE THINGS.
    // HOT SAUCE
    // Request Path to index: /hot-sauce
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("hotSauces", hotSauceDao.findAll());
        model.addAttribute("title", "Get Sauced!");

        return "hot-sauce/index";
    }

    // Request Path to add hot sauces: /hot-sauce/add

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addHotSauces(Model model) {
        model.addAttribute("title", "Add Hot Sauce");
        model.addAttribute(new HotSauce());
        model.addAttribute("brands", brandDao.findAll());

        return "hot-sauce/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addHotSauces(@ModelAttribute @Valid HotSauce newHotSauce,
                               Errors errors,
                               @RequestParam int brandId, Model model)
    {
        if (errors.hasErrors()){
            model.addAttribute("title", "Add Hot Sauces");
            return "hot-sauce/add";
        }

        Optional<Brand> brand = brandDao.findById(brandId);
        newHotSauce.setBrand(brand);
        hotSauceDao.save(newHotSauce);
        return "redirect:";
    }


//TODO Add a section for CASERA or Homemade sauces.
    //This will have location and attempt to have recipes.
}


