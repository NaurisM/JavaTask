package com.example.countries.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    Country country;

    @BeforeEach
    void setUp() {
        country = new Country();
    }

    @Test
    void testCalculateDensity() {
        country.setPopulation(10);
        country.setArea(5);
        assertEquals(2, country.calculateDensity());
    }

    @Test
    void testCalculateDensityWithNull() {
        country.setPopulation(10);
        assertEquals(0, country.calculateDensity());
    }
}