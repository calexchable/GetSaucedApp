package com.example.GetSaucedApp.models;

public class SauceField {

    private String value;
    private int id;
    private static int nextId = 1;

    public SauceField() {
        id = nextId;
        nextId++;
    }

    public SauceField(String value) {
        this.value = value;
    }

    public boolean contains(String value) {
        return this.value.toLowerCase().contains(value.toLowerCase());
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SauceField sauceField = (SauceField) o;

        return id == sauceField.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
