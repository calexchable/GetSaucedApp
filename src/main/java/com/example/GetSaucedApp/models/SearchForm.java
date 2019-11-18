package com.example.GetSaucedApp.models;

import javax.validation.constraints.Size;

public class SearchForm {

    @Size(min=1, message = "Please enter a search term.")
    private String searchTerm;

    //Constructors:
    public SearchForm(){

    }

    public SearchForm(String searchTerm){
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
