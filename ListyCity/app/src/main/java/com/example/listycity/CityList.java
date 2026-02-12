package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Keeps track of a list of City objects.
 */
public class CityList {

    /** Internal list of cities. */
    private final List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     *
     * @param city The city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     * (Returns a copy so callers can't modify the internal list.)
     *
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> copy = new ArrayList<>(cities);
        Collections.sort(copy);
        return copy;
    }

    /**
     * Checks whether a given city is in the list.
     *
     * @param city The city to check
     * @return true if the city is present, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     *
     * @param city The city to remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
