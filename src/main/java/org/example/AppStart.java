package org.example;

import org.example.interfaces.IWelcomeApp;

import java.time.LocalDateTime;

public class AppStart implements IWelcomeApp {
    static String greeting;

    static {
        int hour = LocalDateTime.now().getHour();
        if (hour >= 5 && hour < 12) {
            greeting = "\nGood morning! " + DEFAULT_WELCOME;
        } else if (hour >= 12 && hour < 18) {
            greeting = "\nGood afternoon! " + DEFAULT_WELCOME;
        } else {
            greeting = "\nGood evening! " + DEFAULT_WELCOME;
        }
    }

    @Override
    public void welcome() {
        System.out.println(greeting);
    }
}
