package com.bobo.model;

public record User(String name, int age) {

    public boolean isAdult() {
        return age >= 18;
    }

    public String greet() {
        if (isAdult()) {
            return "Hello, " + name + ". Welcome aboard!";
        }
        return "Hi " + name + "! You're still young.";
    }
}
