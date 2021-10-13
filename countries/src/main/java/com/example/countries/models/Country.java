package com.example.countries.models;

public class Country {

    private String name;
    private String capital;
    private Object currencies;
    private Integer population;
    private Integer area;

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

    public void setPopulation(int newPopulation) { this.population = newPopulation; }

    public int getArea() {
        return area;
    }

    public void setArea(int newArea) { this.area = newArea; }

    public double calculateDensity() {
        if (population == null || area == null)
            return 0;
        return population / (double)area;
    }
}

