package com.greetings;


import com.greetings.api.Greetings;

public class Main {

    public static void main(String... args) {
        Greetings greatings = Greetings.create();
        System.out.println(greatings.greet());
    }
}
