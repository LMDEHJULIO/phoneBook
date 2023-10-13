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
}