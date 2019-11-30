package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchCategory;

import java.util.ArrayList;
import java.util.List;

public abstract class HotSauceDaoImpl implements HotSauceDao {

    private List<HotSauce> hotSauce;
    private static HotSauceDaoImpl instance;

    public HotSauceDaoImpl(){
        hotSauce = new ArrayList<>();
    }

    @Override
    public List<HotSauce> findAll() {
        return hotSauce;
    }

    public HotSauce getByBrand(int brand) {
        return hotSauce.get(brand);
    }

    public HotSauce getByName(int name) {
        return hotSauce.get(name);
    }

    public HotSauce getByDescription(int description) {
        return hotSauce.get(description);
    }

    public HotSauce findByValue(String value) {

        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauce) {

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

    public void add(HotSauce hotSauce) {
        hotSauce.add(hotSauce);
    }

    private static SearchCategory getFieldByType(HotSauce hotSauce, SearchCategory type) {
        switch(type) {
            case BRAND:
                return hotSauce.getBrand();
            case NAME:
                return hotSauce.getName();
            case DESCRIPTION:
                return hotSauce.getDescription();
        }
        throw new IllegalArgumentException("Cannot get field of type " + type);
    }

}