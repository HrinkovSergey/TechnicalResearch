package com.example.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListService {
    private static final String SEPARATOR = "------------------";

    public void workWithArrayList() {
        System.out.println("-----------------------\n    ArrayList:    \n-----------------------");
        showAdd();
        showRemove();
        showRetainAll();
        showReplaceAll();
        showRemoveAll();
    }

    private void showAdd() {
        System.out.println("Create arrayList");
        List<String> arrayList = new ArrayList<>();
        System.out.println("Add first, second, third");
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        System.out.println("arrayList: " + arrayList + "\n");

        System.out.println("arrayList.add(1,\"new second\");");
        arrayList.add(1,"new second");
        System.out.println("arrayList: " + arrayList + "\n" + SEPARATOR);
    }

    private void showRemove() {
        System.out.println("Create arrayList");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("arrayList: " + arrayList + "\n");
        System.out.println("arrayList.remove(2);");
        arrayList.remove(2);
        System.out.println("arrayList: " + arrayList + "\n");
        System.out.println("Remove by object: Banana");
        arrayList.remove("Banana");
        System.out.println("arrayList: " + arrayList + "\n" + SEPARATOR);
    }

    private void showRemoveAll() {
        System.out.println("Create arrayLists: ");
        List< String> listFirst = new ArrayList<>();
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");
        System.out.println("listFirst: " + listFirst);

        List< String> listSecond = new ArrayList<>();
        listSecond.add("Green");
        listSecond.add("Red");
        listSecond.add("White");
        System.out.println("listSecond: " + listSecond);

        System.out.println("listSecond.removeAll(listFirst);");
        listSecond.removeAll(listFirst);

        System.out.println("listFirst: " + listFirst);
        System.out.println("listSecond: " + listSecond);
        System.out.println(SEPARATOR);
    }

    private void showRetainAll() {
        System.out.println("Create arrayLists: ");
        List< String> listFirst = new ArrayList<>();
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");
        System.out.println("listFirst: " + listFirst);

        List< String> listSecond = new ArrayList<>();
        listSecond.add("Green");
        listSecond.add("Red");
        listSecond.add("White");
        System.out.println("listSecond: " + listSecond);

        listSecond.retainAll(listFirst);
        System.out.println("\nlistSecond.retainAll(listFirst);");

        System.out.println("listFirst: " + listFirst);
        System.out.println("listSecond: " + listSecond);
        System.out.println(SEPARATOR);
    }

    private void showReplaceAll() {
        System.out.println("Create arrayLists: ");
        ArrayList< String> arrayList = new ArrayList<>(Arrays.asList("A   ", "  B  ", "C"));
        System.out.println("arrayList: " + arrayList + "\n");
        System.out.println("arrayList.replaceAll(String::trim);");
        arrayList.replaceAll(String::trim);
        System.out.println("arrayList: " + arrayList + "\n" + SEPARATOR);
    }
}
