package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;

import java.util.ArrayList;
import java.util.List;

public abstract class HotSauceDaoImpl implements HotSauceDao {

    private List<HotSauce> hotSauce;

    public HotSauceDaoImpl() {
        hotSauce = new ArrayList<>();
    }

    @Override
    public List<HotSauce> findAll() {
        return hotSauce;
    }

    @Override
    public ArrayList<HotSauce> getByBrand(String value) {

        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauce) {
            if (hotSauce.getBrand().contains(value))
                matchingHotSauces.add(hotSauce);
        }

        return matchingHotSauces;
    }

    @Override
    public ArrayList<HotSauce> getByName(String value) {

        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauce) {
            if (hotSauce.getName().contains(value))
                matchingHotSauces.add(hotSauce);
        }

        return matchingHotSauces;
    }

    @Override
    public ArrayList<HotSauce> getByDescription(String value) {

        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauce) {
            if (hotSauce.getDescription().contains(value))
                matchingHotSauces.add(hotSauce);
        }

        return matchingHotSauces;
    }

}