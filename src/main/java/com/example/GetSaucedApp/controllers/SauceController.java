package com.example.GetSaucedApp.controllers;


import com.example.GetSaucedApp.models.data.HotSauceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Christopher Alex Chable'
 */

@Controller
@RequestMapping("hot-sauce")
public class SauceController {

    @Autowired
    private HotSauceDao hotSauceDao;

//TODO: WRITE CONTROLLER TO ACCESS AND INPUT THE THINGS ADD FORM.

}
