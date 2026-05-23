package com.bobo.model;

public record User(String name, int age) {

    public boolean isAdult() {
        return age >= 18;
    }

    public String greet() {
        if (isAdult()) {
            return "你好世界, " + name + "!";
        }
        return "你好世界, " + name + "!";
    }
}
