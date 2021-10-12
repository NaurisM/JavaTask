package com.example.countries.services;

import com.example.countries.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;
import java.util.*;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://restcountries.com/v2/regionalbloc/eu?fields=name,capital,currencies,population,area";

    @Override
    public List<Country> getAllCountries() {
        Country[] countries = restTemplate.getForObject(url, Country[].class);
        return Arrays.asList(countries);
    }

    public List<String> sortListByArea() {
        List<Country> countryList = getAllCountries();
        List<String > areaList = new ArrayList();
        Collections.sort(countryList,
                Comparator.comparingInt(Country::getArea).reversed());
        countryList.subList(0, 10).forEach(country -> areaList.add(country.getName() + " : " + country.getArea()));
        return areaList;
    }

    public List<String> sortListByPopulation() {
        List<Country> countryList = getAllCountries();
        List<String > populationList = new ArrayList();
        Collections.sort(countryList,
                Comparator.comparingInt(Country::getPopulation).reversed());
        countryList.subList(0, 10).forEach(country -> populationList.add(country.getName() + " : " + country.getPopulation()));
        return populationList;
    }

    public List<String> sortListByDensity() {
        List<Country> countryList= getAllCountries();
        List<String > densityList = new ArrayList();
        DecimalFormat df = new DecimalFormat("#.#");
        Collections.sort(countryList,
                Comparator.comparingDouble(Country::calculateDensity).reversed());
        countryList.subList(1, 11).forEach(country -> densityList.add(country.getName() + " : " + df.format(country.calculateDensity())));
        return densityList;
    }
}
