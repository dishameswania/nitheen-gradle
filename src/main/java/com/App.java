package com.example;

import com.google.common.collect.ImmutableList;

public class App {
    public static void main(String[] args) {
        ImmutableList<String> items = ImmutableList.of("Hello", "from", "Guava!");
        System.out.println(String.join(" ", items));
    }

    public static ImmutableList<String> getGreeting() {
        return ImmutableList.of("Hello", "World");
    }
}
