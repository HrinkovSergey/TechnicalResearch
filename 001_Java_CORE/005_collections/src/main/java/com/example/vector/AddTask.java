package com.example.vector;

import java.util.Vector;

class AddTask implements Runnable {
    private Vector<Integer> vector;

    public AddTask(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            vector.add(i);
        }
    }
}
