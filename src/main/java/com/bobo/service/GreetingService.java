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
        return "Goodbye, " + user.name() + ". See you soon!";
    }
}
