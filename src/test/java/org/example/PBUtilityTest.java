package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PBUtilityTest {

    @Test
    void isNotNull() {
        assertEquals("Test", PBUtility.checkIfNull("Test", "Test throw"));
    }

    @Test
    void isNull(){
        assertThrows(IllegalArgumentException.class, () -> PBUtility.checkIfNull(null, "Expected exception thrown"));
    }

    @Test
    public void testValidNumber(){
        assertFalse(PBUtility.isValidPhoneNumber("121312"));
        assertFalse(PBUtility.isValidPhoneNumber("asd"));
    }

    @Test void testValidInput(){
        PBUtility.validateInput("Steve", "18001231234");
    }
//
//    @Test void testInvalidInput(){
//        assertThrows(IllegalArgumentException.class, () -> PBUtility.validateInput("Steve", "1233"));
//
//    }

    @Test void testDups(){
        assertThrows(IllegalArgumentException.class, () -> PBUtility.validateInput("Steve", "18001231234", "18001231234"));
    }
}