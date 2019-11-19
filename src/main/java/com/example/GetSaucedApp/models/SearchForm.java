package com.example.GetSaucedApp.models;

import javax.validation.constraints.Size;

public class SearchForm {

    //Search By Options
    private SearchCategory[] searchCategories = SearchCategory.values();
    private SearchCategory searchBy = SearchCategory.ALL;

    // Keyword search string
    @Size(min=1, message = "Please enter a search term.")
    private String searchTerm;


    //Constructors:
    public SearchForm(){

    }

    public SearchForm(SearchCategory searchBy, String searchTerm){
        this.searchBy = searchBy;
        this.searchTerm = searchTerm;
    }


    public SearchCategory getSearchBy() {
        return searchBy;
    }

    public void setSearchBy(SearchCategory searchBy) {
        this.searchBy = searchBy;
    }

    public SearchCategory[] getSearchCategories() {
        return searchCategories;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
