package com.example.GetSaucedApp.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christopher Alex Chable'
 */

@Entity
public class Brand {
    //Fields: ID, NAME
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, message = "Please enter the brand of hot sauce.")
    private String name;

    @OneToMany
    @JoinColumn(name = "brand_id")
    private List<Brand> brands = new ArrayList<>();

    //Constructors: Default, ID, NAME
    public Brand(){
    }

    public Brand(int id) {
        this.id = id;
    }

    public Brand(String name) {
        this.name = name;
    }


    //Getters and Setters: ID, NAME
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;

    }
}
