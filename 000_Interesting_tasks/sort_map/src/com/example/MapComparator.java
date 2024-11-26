package com.example;

import java.util.Comparator;
import java.util.Map;


public class MapComparator implements Comparator<String> {

    private final Map<String, Integer> map;

    public MapComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        Integer i1 = map.get(o1);
        Integer i2 = map.get(o2);
        return i1 - i2;
    }
}
