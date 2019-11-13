package com.example.GetSaucedApp.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SearchForm {

    @NotNull
    @Size(min=1, message = "Please select a search option.")
    private String searchBy;

    @NotNull
    @Size(min=1, message = "Please enter a search term.")
    private String searchTerm;

    //Constructors:
    public SearchForm(){

    }

    public SearchForm(String searchBy, String searchTerm){
        this.searchBy = searchBy;
        this.searchTerm = searchTerm;
    }
    public String getSearchBy() {
        return searchBy;
    }

    public void setSearchBy(String searchBy) {
        this.searchBy = searchBy;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
