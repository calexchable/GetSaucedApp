package com.example.GetSaucedApp.models;

import javax.validation.constraints.Size;

public class SearchForm {

    //Search By Options
    private SearchCategory[] fields = SearchCategory.values();
    private SearchCategory searchField = SearchCategory.ALL;

    // Keyword search string
    @Size(min=1, message = "Please enter a search term.")
    private String keyword;


    //Constructors:
    public SearchForm(){

    }

    public SearchForm(SearchCategory searchBy,
                      String keyword){
        this.searchField = searchBy;
        this.keyword = keyword;
    }

    //Getters and Setters:
    public SearchCategory getSearchField() {
        return searchField;
    }

    public void setSearchField(SearchCategory searchField) {
        this.searchField = searchField;
    }

    public SearchCategory[] getFields() {
        return fields;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
