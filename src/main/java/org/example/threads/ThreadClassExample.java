package org.example.threads;

public class ThreadClassExample extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Actual number: " + i + ", Thread ID: " + Thread.currentThread().getId());

        }
    }
}
