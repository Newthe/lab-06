package com.example.listycity;

import java.util.Objects;

/**
 * Represents a City with a city name and a province.
 * This class implements Comparable so city objects can be sorted.
 */
public class City implements Comparable<City> {

    /** The city name (e.g., Edmonton). */
    private final String city;

    /** The province name (e.g., Alberta). */
    private final String province;

    /**
     * Creates a City object.
     *
     * @param city The city name (non-null)
     * @param province The province name (non-null)
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     *
     * @return City name
     */
    public String getCityName() {
        return city;
    }

    /**
     * Returns the province name.
     *
     * @return Province name
     */
    public String getProvinceName() {
        return province;
    }

    /**
     * Compares cities for sorting.
     * Primary sort: city name, Secondary sort: province name.
     *
     * @param other The other city to compare against
     * @return negative if this {@code <} other, 0 if equal, positive if this {@code >} other
     */
    @Override
    public int compareTo(City other) {
        int byCity = this.city.compareTo(other.city);
        if (byCity != 0) return byCity;
        return this.province.compareTo(other.province);
    }

    /**
     * Two City objects are equal if they have the same city and province.
     *
     * @param o object to compare
     * @return true if equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) &&
                Objects.equals(province, city1.province);
    }

    /**
     * Hash code consistent with equals().
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
