package org.example.threads;

public class RunnableInterfaceExample implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i <= 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Actual number: " + i + ", Thread ID: " + Thread.currentThread().getId());
        }
    }
}
