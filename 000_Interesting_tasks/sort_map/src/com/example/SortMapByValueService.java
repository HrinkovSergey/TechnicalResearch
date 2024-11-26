package com.example;

import java.util.Map;
import java.util.TreeMap;

public class SortMapByValueService {

    public void showTask() {
        Map<String, Integer> nonSortedMap = Map.of(

                "Two", 2,
                "Three", 3,
                "Five", 5,
                "One", 1,
                "Six", 6,
                "Four", 4,
                "Seven", 7
        );

        Map<String, Integer> sortedMap = sortMapByValue(nonSortedMap);
        sortedMap.putAll(nonSortedMap);
        sortedMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private Map<String, Integer> sortMapByValue(Map<String, Integer> unsortedMap) {
        return new TreeMap<>(new MapComparator(unsortedMap));
    }
}
