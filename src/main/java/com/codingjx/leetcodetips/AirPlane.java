package com.codingjx.leetcodetips;

public class AirPlane {
    String brand;
    Integer makeYear;

    public AirPlane(String brand, Integer makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
               "brand='" + brand + '\'' +
               ", makeYear=" + makeYear +
               '}';
    }
}
