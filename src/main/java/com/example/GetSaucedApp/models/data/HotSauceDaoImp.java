package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HotSauceDaoImp implements HotSauceDao {

    private List<HotSauce> hotSauces;

    @Override
    public List<HotSauce> getAllSauces() {
        return hotSauces;
    }

    @Override
    public ArrayList<HotSauce> findByValue(String value) {
        ArrayList<HotSauce> matchingSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauces) {

            if (hotSauce.getName().toLowerCase().contains(value)) {
                matchingSauces.add(hotSauce);
                continue;
            }

            for (SearchCategory column : SearchCategory.values()) {
                if (column != SearchCategory.ALL && getFieldByType(hotSauce, column).contains(value)) {
                    matchingSauces.add(hotSauce);
                    break;
                }
            }
        }

        return matchingSauces;

    }

    @Override
    public String getFieldByType(HotSauce hotSauce, SearchCategory type) {
        switch(type) {
            case BRAND:
                return hotSauce.getBrand();
            case NAME:
                return hotSauce.getName();
            case DESCRIPTION:
                return hotSauce.getDescription();
        }
        throw new IllegalArgumentException("Cannot get field of " + type);

    }

    @Override
    public ArrayList<HotSauce> findByColumnAndValue(SearchCategory column, String value) {
        ArrayList<HotSauce> matchingSauces = new ArrayList<>();

        for (HotSauce hotSauce : hotSauces) {
            if (getFieldByType(hotSauce, column).contains(value))
                matchingSauces.add(hotSauce);
        }

        return matchingSauces;

    }

    @Override
    public <S extends HotSauce> S save(S entity) {
        return null;
    }

    @Override
    public <S extends HotSauce> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<HotSauce> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<HotSauce> findAll() {
        return null;
    }

    @Override
    public Iterable<HotSauce> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(HotSauce entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends HotSauce> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
