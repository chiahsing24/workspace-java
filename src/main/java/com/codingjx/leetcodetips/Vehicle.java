package com.codingjx.leetcodetips;

public class Vehicle implements Comparable<Vehicle> {
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "brand='" + brand + '\'' +
               ", makeYear=" + makeYear +
               '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.brand.compareTo(o.brand);
    }
}
