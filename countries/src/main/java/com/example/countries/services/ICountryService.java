package com.example.countries.services;

import com.example.countries.models.Country;

import java.util.List;


public interface ICountryService {

    List<Country> getAllCountries();

    List<String> sortListByArea();

    List<String> sortListByPopulation();

    List<String> sortListByDensity();
}
