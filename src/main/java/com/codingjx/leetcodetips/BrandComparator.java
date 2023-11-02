package com.codingjx.leetcodetips;

import java.util.Comparator;

public class BrandComparator implements Comparator<AirPlane> {
    @Override
    public int compare(AirPlane o1, AirPlane o2) {
        return o1.brand.compareTo(o2.brand);
    }
}
