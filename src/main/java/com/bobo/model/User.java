package com.bobo.model;

public record User(String name, int age) {

    public boolean isAdult() {
        return age >= 18;
    }

    public String greet() {
        return "你好世界";
    }
}
