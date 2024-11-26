package com.example.vector;

import java.util.Vector;

public class VectorService {

    public void workWithVector() {
        Vector<Integer> sharedVector = new Vector<>();

        // Create two threads that modify the shared Vector
        Thread thread1 = new Thread(new AddTask(sharedVector));
        Thread thread2 = new Thread(new AddTask(sharedVector));

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // Print the final contents of the Vector
        System.out.println("Final Vector contents: " + sharedVector);
    }
}
