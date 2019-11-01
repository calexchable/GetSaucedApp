package com.example.GetSaucedApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Optional;

/**
 * Created by Christopher Alex Chable'
 */
@Entity
public class HotSauce {

    // Fields: ID, NAME, DESCRIPTION, BRAND
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, message = "Please enter the name of the hot sauce.")
    private String name;

    @NotNull
    @Size(min=1, message = "Description cannot be empty.")
    private String description;

    @NotNull
    @Size(min=1, message = "Brand Name cannot be empty.")
    private String brand;

    //TODO: ADD A TYPE System (examples bbq, salsa, hot sauce)***
    //TODO: ADD AN INGREDIENTS LISTS (water, vinegar, etc.)*
    //TODO: ADD RATING SYSTEM (TASTE)*****
    //TODO: ADD RATING SYSTEM (SPICINESS)*****

    //Constructors:
    public HotSauce(){
    }

    public HotSauce(String name, String description){
        this.name = name;
        this.description = description;

    }
    //Getters and Setters: ID, BRAND, NAME, DESCRIPTION
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

}
