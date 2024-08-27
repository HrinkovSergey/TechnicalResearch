package com.example.arraydeque;

public class ArrayDequeService {
    private static final String SEPARATOR = "------------------";

    public void work() {
        System.out.println("-----------------------\n    ArrayDeque:    \n-----------------------");
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addRegularTask("Task1");
        System.out.println("Added Task1: " + scheduler);
        scheduler.addHighPriorityTask("UrgentTask");
        System.out.println("Added UrgentTask: " + scheduler);
        scheduler.addRegularTask("Task2");
        System.out.println("Added Task2: " + scheduler);
        while (!scheduler.isEmpty()) {
            System.out.println("Executing: " + scheduler.getNextTask());
        }
        System.out.println(SEPARATOR);
    }
}
