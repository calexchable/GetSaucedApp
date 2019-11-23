package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;

import java.util.ArrayList;

public class HotSauceData {

    private ArrayList<HotSauce> hotSauces = new ArrayList<>();
    private static HotSauceData sauceInstance;

    public static HotSauceData getSauceInstance() {
        if (sauceInstance == null) {
            sauceInstance = new HotSauceData();
        }
        return sauceInstance;
    }

}
