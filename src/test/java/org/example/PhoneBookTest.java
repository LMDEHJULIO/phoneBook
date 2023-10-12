package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    public PhoneBook phoneBook;

    @BeforeEach

    public void setUp(){
        phoneBook = new PhoneBook();
    }

    @Test
    void add() {
        assertTrue(phoneBook.add("Steve Jobs", "1-800-Stevie"));

    }

    @Test
    void addAll() {
        List<String> numbers = Arrays.asList("1-800-Stevie", "1-800-Webie");

        assertTrue(phoneBook.addAll("Steve Jobs", numbers));
    }

    @Test
    void remove() {
        assertTrue(phoneBook.add("Steve Jobs", "1-800-Stevie"));

        phoneBook.remove("Steve Jobs");

        assertFalse(phoneBook.hasEntry("Steve Jobs"));
    }

    @Test
    void hasEntry() {
        assertFalse(phoneBook.hasEntry("Steve Jobs"));
    }

    @Test
    void lookup() {
        assertNull(phoneBook.lookup("Steve Jobs"));

        phoneBook.add("Steve Jobs", "1-800-1234");

        assertEquals(Arrays.asList("1-800-1234"), phoneBook.lookup("Steve Jobs"));
    }

    @Test
    void reverseLookUp() {
        phoneBook.add("Steve Jobs", "1-800-1234");
        assertEquals("Steve Jobs", phoneBook.reverseLookUp("1-800-1234"));
    }

    @Test
    void getAllContactNames() {
        phoneBook.add("Steve Jobs", "1-800-1234");
        phoneBook.add("Bill Gates", "1-800-5678");
        assertEquals("Steve Jobs, Bill Gates, ", phoneBook.getAllContactNames());
    }

    @Test
    void testToString() {
        phoneBook.add("Steve Jobs", "1-800-1234");
        String expected = "PhoneBook{phoneBook={Steve Jobs=[1-800-1234]}}";

        assertEquals(expected, phoneBook.toString());
    }
}