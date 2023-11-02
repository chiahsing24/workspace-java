package com.codingjx.leetcodetips;

import java.util.Comparator;

public class MakeYearComparator implements Comparator<AirPlane> {
    @Override
    public int compare(AirPlane o1, AirPlane o2) {
        return o1.makeYear.compareTo(o2.makeYear);
    }
}
