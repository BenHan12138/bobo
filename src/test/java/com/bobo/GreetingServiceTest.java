package com.bobo;

import com.bobo.model.User;
import com.bobo.service.GreetingService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void testAdultGreeting() {
        User user = new User("Alice", 25);
        String result = service.greetUser(user);
        assertTrue(result.contains("Welcome aboard"));
    }

    @Test
    void testMinorGreeting() {
        User user = new User("Bob", 15);
        String result = service.greetUser(user);
        assertTrue(result.contains("still young"));
    }

    @Test
    void testNullUserGreeting() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.greetUser(null);
        });
    }

    @Test
    void testFarewell() {
        User user = new User("Charlie", 30);
        String result = service.farewell(user);
        assertEquals("Farewell, Charlie. It was a pleasure!", result);
    }

    @Test
    void testNullFarewell() {
        String result = service.farewell(null);
        assertEquals("Goodbye, stranger.", result);
    }
}
