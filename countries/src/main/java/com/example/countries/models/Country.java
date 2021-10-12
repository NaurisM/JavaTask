package com.example.countries.models;

public class Country {

    private String name;
    private String capital;
    private Object currencies;
    private int population;
    private int area;

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public Object getCurrencies() {
        return currencies;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public double calculateDensity() {
        if (population != 0 || area != 0)
            return population / (double)area;
        return 0;
    }
}

