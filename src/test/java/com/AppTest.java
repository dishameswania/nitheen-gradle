package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGetGreeting() {
        var greeting = App.getGreeting();
        assertEquals(2, greeting.size());
        assertEquals("Hello", greeting.get(0));
        assertEquals("World", greeting.get(1));
    }
}
