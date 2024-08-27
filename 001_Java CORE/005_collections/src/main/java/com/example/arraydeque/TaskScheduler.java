package com.example.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private final Deque<String> taskQueue;

    public TaskScheduler() {
        taskQueue = new ArrayDeque<>();
    }

    public void addHighPriorityTask(String task) {
        taskQueue.addFirst(task);
    }

    public void addRegularTask(String task) {
        taskQueue.addLast(task);
    }

    public String getNextTask() {
        return taskQueue.pollFirst();
    }

    public String getLastTask() {
        return taskQueue.pollLast();
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }

    public String toString() {
        return taskQueue.toString();
    }
}
