package com.example.sortedmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapService {
    private static final String SEPARATOR = "------------------";

    public void work() {
        System.out.println("-----------------------\n    TreeMap:    \n-----------------------");
        // Step 1: Create a TreeMap to store transactions
        TreeMap<Long, String> transactions = new TreeMap<>();

        // Step 2: Add some transactions with timestamps
        transactions.put(1633024800000L, "Transaction1: $100 at 2021-10-01 00:00:00"); // Oct 1, 2021
        transactions.put(1633100400000L, "Transaction2: $150 at 2021-10-02 00:00:00"); // Oct 2, 2021
        transactions.put(1633186800000L, "Transaction3: $200 at 2021-10-03 00:00:00"); // Oct 3, 2021
        transactions.put(1633273200000L, "Transaction4: $250 at 2021-10-04 00:00:00"); // Oct 4, 2021

        // Step 3: Print all transactions to see the order in TreeMap
        System.out.println("All transactions in TreeMap (sorted by timestamp):");
        for (Map.Entry<Long, String> entry : transactions.entrySet()) {
            System.out.println("Timestamp: " + entry.getKey() + ", Details: " + entry.getValue());
        }

        // Step 4: Query transactions within a specific date range
        // We want transactions from Oct 1, 2021 to Oct 3, 2021
        long startTime = 1633024800000L; // Oct 1, 2021 00:00:00
        long endTime = 1633186800000L;   // Oct 3, 2021 00:00:00

        SortedMap<Long, String> dayTransactions = transactions.subMap(startTime, endTime);

        // Step 5: Print the transactions in the specified range
        System.out.println("\nTransactions from Oct 1, 2021 to Oct 3, 2021:");
        for (Map.Entry<Long, String> entry : dayTransactions.entrySet()) {
            System.out.println("Timestamp: " + entry.getKey() + ", Details: " + entry.getValue());
        }

        // Step 6: Query all transactions from a specific date onwards
        // Transactions from Oct 2, 2021 onwards
        SortedMap<Long, String> fromSecondDay = transactions.tailMap(1633100400000L);

        // Step 7: Print transactions from Oct 2, 2021 onwards
        System.out.println("\nTransactions from Oct 2, 2021 onwards:");
        for (Map.Entry<Long, String> entry : fromSecondDay.entrySet()) {
            System.out.println("Timestamp: " + entry.getKey() + ", Details: " + entry.getValue());
        }
        System.out.println(SEPARATOR);
    }
}
