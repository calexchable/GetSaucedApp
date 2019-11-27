package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchCategory;

import java.util.ArrayList;

public class HotSauceData {

    private static ArrayList<HotSauce> hotSauces = new ArrayList<>();
    private static HotSauceData sauceInstance;

    public static HotSauceData getSauceInstance() {
        if (sauceInstance == null) {
            sauceInstance = new HotSauceData();
        }
        return sauceInstance;
    }

    public static ArrayList<HotSauce> findByValue (String value) {

        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauces) {
            if (hotSauce.getName().toLowerCase().contains(value)) {
                matchingHotSauces.add(hotSauce);
                continue;
            }

            for (SearchCategory column : SearchCategory.values()) {
                if (column != SearchCategory.ALL && getFieldByType(hotSauce, column).contains(value)) {
                    matchingHotSauces.add(hotSauce);
                    break;
                }
            }
        }

        return matchingHotSauces;
    }

    private static String getFieldByType (HotSauce hotSauce, SearchCategory type) {
        switch(type) {
            case BRAND:
                return hotSauce.getBrand();
            case NAME:
                return hotSauce.getName();
            case DESCRIPTION:
                return hotSauce.getDescription();
        }
        throw new IllegalArgumentException("Cannot Access " + type);
    }

    public static void setHotSauces(ArrayList<HotSauce> hotSauces) {
        HotSauceData.hotSauces = hotSauces;
    }

    public static ArrayList<HotSauce> findByColumnAndValue(SearchCategory column, String value) {
        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauces) {
            if (getFieldByType(hotSauce, column).contains(value))
                matchingHotSauces.add(hotSauce);
        }

        return matchingHotSauces;
    }

}