package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for HelloWorld class.
 */
public class HelloWorldTest {

    @Test
    public void testGreetMethod() {
        String expected = "Hello, World!";
        String actual = HelloWorld.greet();
        assertEquals(expected, actual);
    }

    @Test
    public void testGreetMethodNotNull() {
        assertNotNull(HelloWorld.greet());
    }

    @Test
    public void testGreetMethodNotEmpty() {
        assertFalse(HelloWorld.greet().isEmpty());
    }

    @Test
    public void testGreetMethodLength() {
        String greeting = HelloWorld.greet();
        assertTrue(greeting.length() > 0);
        assertEquals(13, greeting.length());
    }
}
