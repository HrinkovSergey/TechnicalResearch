package com.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapService {

    private static final String SEPARATOR = "------------------";

    public void workWithHashMap() {
        System.out.println("-----------------------\n    HashMap:    \n-----------------------");
        showHash();
        showCollision();
        showPut();
    }
    private void showHash() {
        System.out.println("    Hash function:    ");
        String key = "BLAKE";
        System.out.println("firstElement.hashCode(): " + key.hashCode());
        int h = key.hashCode();
        System.out.println("key.hashCode(): " + h + "\n");
        String binaryResult = Integer.toBinaryString(h);
        System.out.println(h + " in binary is: " + binaryResult); //11110000100110000000010001

        int i = h >>> 16;
        System.out.println("i = h >>> 16 (shifting all bits to the right by 16 positions): " + Integer.toBinaryString(i) + ": " + i); //00000000000000001111000101
        int hash = h ^ i;
        System.out.println("result = " + h + " ^ " + i + " = " + hash);
        System.out.println(Integer.toBinaryString(h) + " ^ " + Integer.toBinaryString(i) + " = " + Integer.toBinaryString(hash) + "\n");

        System.out.println("    Get index:    ");
        int bucketArraySize = 16;
        System.out.println("bucketArraySize: " + bucketArraySize);
        System.out.println("(bucketArraySize - 1) & hash;");
        int r = bucketArraySize - 1;
        int index = r & hash;
        System.out.println(r + " & " + hash + " = " + index);
        String rBinary = String.format("%24s", Integer.toBinaryString(r)).replace(' ', '0');
        String hashBinary = String.format("%24s", Integer.toBinaryString(hash)).replace(' ', '0');
        String indexBinary = String.format("%24s", Integer.toBinaryString(index)).replace(' ', '0');

        System.out.println(rBinary + " & " + hashBinary + " = " + indexBinary + "\n");
    }


    private void showCollision() {
        String firstElement = "BLAKE";
        String secondElement = "KING";
        System.out.println("firstElement: " + firstElement);
        System.out.println("firstElement.hashCode(): " + firstElement.hashCode());
        System.out.println("hash(firstElement): " + hash(firstElement) + "\n");
        System.out.println("getIndex(hash(firstElement), 16): ");
        System.out.println("Map index of element: " + getIndex(hash(firstElement), 16) + "\n");

        System.out.println("secondElement: " + secondElement);
        System.out.println("secondElement.hashCode(): " + secondElement.hashCode());
        System.out.println("hash(secondElement): " + hash(secondElement) + "\n");
        System.out.println("getIndex(hash(secondElement), 16): ");
        System.out.println("Map index of element: " + getIndex(hash(secondElement), 16) + "\n" + SEPARATOR);
    }

    private void showPut() {
        System.out.println("    Put:    ");
        String firstElement = "PETER";
        String secondElement = "VASILIY";
        System.out.println("firstElement: " + firstElement);
        System.out.println("secondElement: " + secondElement);
        Map<String, Integer> map = new HashMap<>();
        map.put(firstElement, 1);
        map.put(secondElement, 2);
        System.out.println("map: " + map);
        System.out.println("map: " + map.entrySet());

    }

    private int hash(Object key) {
        if (key == null) {
            return 0;
        }
        int h = key.hashCode();
        return h ^ (h >>> 16);
    }

    private int getIndex(int hash, int bucketArraySize){
        return  (bucketArraySize - 1) & hash;
    }
}
