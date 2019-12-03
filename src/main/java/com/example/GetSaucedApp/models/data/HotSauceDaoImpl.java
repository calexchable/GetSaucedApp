package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;

import java.util.ArrayList;
import java.util.List;

//import com.example.GetSaucedApp.models.SearchCategory;

public abstract class HotSauceDaoImpl implements HotSauceDao {

    private List<HotSauce> hotSauce;

//    private static HotSauceDaoImpl instance;

    public HotSauceDaoImpl() {
        hotSauce = new ArrayList<>();
    }

    @Override
    public List<HotSauce> findAll() {
        return hotSauce;
    }

//    public ArrayList<HotSauce> findByColumnAndValue(String column, String value) {
//
//        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();
//
//        for (HotSauce hotSauce : hotSauce) {
//
//            if (getByColumn(hotSauce, column).contains(value))
//                    matchingHotSauces.add(hotSauce);
//            }
//
//        return matchingHotSauces;
//
//    }

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

//    private static String getByColumn(HotSauce hotSauce, String type) {
//
//        switch(type) {
//            case BRAND:
//                return hotSauce.getBrand();
//            case NAME:
//                return hotSauce.getName();
//            case DESCRIPTION:
//                return hotSauce.getDescription();
//        }
//    }
//}
//
//
//
//    public ArrayList<HotSauce> findByValue(String value) {
//        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();
//
//        for (HotSauce hotSauce : hotSauce) {
//
//            if (hotSauce.getName().toLowerCase().contains(value)) {
//                matchingHotSauces.add(hotSauce);
//                continue;
//            }
//
//            for (SearchCategory column : SearchCategory.values()) {
//            for (String column : SearchForm.value()) {
//                if (column != SearchForm.ALL && getFieldByType(hotSauce, column).contains(value)) {
//                    matchingHotSauces.add(hotSauce);
//                    break;
//                }
//            }

//        }

//        return matchingHotSauces;

//    }
//}


//    public HotSauce getByBrand(String brand) {
//        return hotSauce.get(brand);
//    }
//
//    public HotSauce getByName(int name) {
//        return hotSauce.get(name);
//    }
//
//    public HotSauce getByDescription(int description) {
//        return hotSauce.get(description);
//    }
//
//    public ArrayList<HotSauce> findByColumnAndValue(SearchCategory column, String value) {
//
//    public ArrayList<HotSauce> findByColumnAndValue(String column, String value) {
//        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();
//
//        for (HotSauce hotSauce : hotSauce) {
//            if (getFieldByType(hotSauce, column).contains(value))
//                matchingHotSauces.add(hotSauce);
//        }
//
//        return matchingHotSauces;
//    }


//    public ArrayList<HotSauce> findByValue(SearchCategory searchField, String value) {
//    public ArrayList<HotSauce> findByValue(String value) {
//        ArrayList<HotSauce> matchingHotSauces = new ArrayList<>();
//        for (HotSauce hotSauce : hotSauce) {
//            if (hotSauce.getName().toLowerCase().contains(value)) {
//                matchingHotSauces.add(hotSauce);
//                continue;
//            }
//            for (SearchCategory column : SearchCategory.values()) {
//            for (String column : SearchForm.value()) {
//                if (column != SearchForm.ALL && getFieldByType(hotSauce, column).contains(value)) {
//                    matchingHotSauces.add(hotSauce);
//                    break;
//                }
//            }
//
//        }
//        return matchingHotSauces;
//    }
//
//    private static String getFieldByType(HotSauce hotSauce, SearchCategory type) {
//        switch(type) {
//            case BRAND:
//                return hotSauce.getBrand();
//            case NAME:
//                return hotSauce.getName();
//            case DESCRIPTION:
//                return hotSauce.getDescription();
//        }
//        throw new IllegalArgumentException("Cannot get field of type " + type);
//    }
//}