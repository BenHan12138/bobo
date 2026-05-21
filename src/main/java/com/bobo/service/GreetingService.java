package com.bobo.service;

import com.bobo.model.User;

public class GreetingService {

    public String greetUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        return user.greet();
    }

    public String farewell(User user) {
        if (user == null) {
            return "Goodbye, stranger.";
        }
        if (user.isAdult()) {
            return "Farewell, " + user.name() + ". It was a pleasure!";
        }
        return "See you later, " + user.name() + ". Keep learning!";
    }
}
