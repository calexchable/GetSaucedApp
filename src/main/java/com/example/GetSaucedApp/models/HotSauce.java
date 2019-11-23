package com.example.GetSaucedApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Christopher Alex Chable'
 */
@Entity
public class HotSauce {

    //Fields
    @Id
    @GeneratedValue
    private int id;
    private static int nextId = 1;

    @NotNull
    @Size(min=1, message = "Please enter the name of the hot sauce.")
    private String name;

    @NotNull
    @Size(min=1, message = "Description cannot be empty.")
    private String description;

    @NotNull
    @Size(min=1, message = "Brand Name cannot be empty.")
    private String brand;

    @NotNull
    private Integer taste;

    @NotNull
    private Integer spice;

    //TODO: ADD A TYPE System (examples bbq, salsa, hot sauce)***
    //TODO: ADD AN INGREDIENTS LISTS (water, vinegar, etc.)*

    //Constructors:
    public HotSauce(){
        id = nextId;
        nextId++;
    }

    public HotSauce(String brand,
                    String name,
                    String description,
                    Integer taste,
                    Integer spice){
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.taste = taste;
        this.spice = spice;

    }
    //Getters and Setters:
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

    public Integer getTaste(){
        return taste;
    }

    public void setTaste(Integer taste){
        this.taste = taste;
    }

    public Integer getSpice(){
        return spice;
    }

    public void setSpice(Integer spice){
        this.spice = spice;
    }

}
