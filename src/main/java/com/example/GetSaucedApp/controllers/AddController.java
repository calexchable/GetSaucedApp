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

@Controller
@RequestMapping(value = "hot-sauces")
public class AddController {

    @Autowired
    private HotSauceDao hotSauceDao;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addHotSauces(Model model) {

        model.addAttribute("title","Add Hot Sauce");
        model.addAttribute(new HotSauce());

        return "hot-sauces/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addHotSauces(@ModelAttribute @Valid HotSauce newHotSauce,
                               Errors errors,
                               Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Try Again to Add Hot Sauce");
            return "hot-sauces/add";
        }

        hotSauceDao.save(newHotSauce);
        return "redirect:";
    }
}
