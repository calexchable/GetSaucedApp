package com.example.GetSaucedApp.models;

public class HotSauceCat {

    private String value;
    private int id;
    private static int nextId = 1;

    public HotSauceCat() {
        id = nextId;
        nextId++;
    }

    public HotSauceCat(String value) {
        this.value = value;
    }

    public boolean contains(String value) {
        return this.value.toLowerCase().contains(value.toLowerCase());
    }

    public String getValue() {
        return value;
    }

    public void setValue(String aValue) {
        value = aValue;
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

        HotSauceCat hotSauceCat = (HotSauceCat) o;

        return id == hotSauceCat.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}