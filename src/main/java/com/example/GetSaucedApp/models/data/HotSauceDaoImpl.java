package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;

import java.util.ArrayList;
import java.util.List;

public abstract class HotSauceDaoImpl implements HotSauceDao {

    private List<HotSauce> hotSauce;

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

}