package com.example.GetSaucedApp.models;

public enum SearchCategory {
    BRAND ("Brand"),
    NAME ("Name"),
    DESCRIPTION ("Description"),
    TASTE ("Taste"),
    SPICE ("Spice"),
    ALL ("All");

    private final String searchCat;

    SearchCategory(String searchCat) {
        this.searchCat = searchCat;
    }

    public String getSearchCat() {
        return searchCat;
    }
}
