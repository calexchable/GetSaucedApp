package com.example.GetSaucedApp.models;

public enum SearchCategory {
    BRAND ("Brand"),
    NAME ("Name"),
    DESCRIPTION ("Description"),
    TASTE ("Taste"),
    SPICE ("Spice"),
    ALL ("All");

    private final String name;

    SearchCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
