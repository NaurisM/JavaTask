package com.example.countries.controllers;

import com.example.countries.models.Country;
import com.example.countries.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/countries/population")
    public List<String> getPopulation() {
        return countryService.sortListByPopulation();
    }

    @GetMapping("/countries/area")
    public List<String> getArea() {
        return countryService.sortListByArea();
    }

    @GetMapping("/countries/density")
    public List<String> getDensity(){
        return countryService.sortListByDensity();
    }
}
