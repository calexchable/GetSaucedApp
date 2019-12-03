package com.example.GetSaucedApp.models;

import javax.validation.constraints.Size;

public class SearchForm {

    private String searchField;

    // Keyword search string
    @Size(min=1, message = "Please enter a search term.")
    private String keyword;

    public SearchForm() {

    }

    public SearchForm(String searchField,
                      String keyword) {
        this.searchField = searchField;
        this.keyword = keyword;
    }

    public String getSearchField() {
        return searchField;
    }
    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}