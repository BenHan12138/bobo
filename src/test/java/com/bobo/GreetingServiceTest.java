package com.bobo;

import com.bobo.model.User;
import com.bobo.service.GreetingService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void testGreeting() {
        User user = new User("Alice", 25);
        String result = service.greetUser(user);
        assertEquals("你好世界", result);
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
        assertEquals("Goodbye, Charlie. See you soon!", result);
    }

    @Test
    void testNullFarewell() {
        String result = service.farewell(null);
        assertEquals("Goodbye, stranger.", result);
    }
}
