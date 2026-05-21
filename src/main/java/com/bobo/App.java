package com.bobo;

import com.bobo.model.User;
import com.bobo.service.GreetingService;

public class App {

    public static void main(String[] args) {
        GreetingService service = new GreetingService();

        if (args.length < 2) {
            System.out.println("Usage: java -jar bobo-app.jar <name> <age>");
            System.out.println("Example: java -jar bobo-app.jar Alice 25");
            return;
        }

        String name = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: age must be a number");
            return;
        }

        User user = new User(name, age);
        System.out.println(service.greetUser(user));
        System.out.println(service.farewell(user));
    }
}
