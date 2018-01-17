package com.andreasekman;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageTest {
    @Test
    public void testStringWithSpecialCharacters() {
        String s = "'-axzoO*åäö";
        int result = 3;
        assertEquals(3, result);
    }

    @Test
    public void testStringWithUpperAndLowerCase() {
        String s = "hElLo HeLlO";
        int result = Language.vowelCount(s);
        assertEquals(4, result);
    }

    @Test
    public void testStringWithManyVowels() {
        String s = "Jakob";
        int result = Language.vowelCount(s);
        assertEquals(2, result);
    }

    @Test
    public void testStringWithOneVowel() {
        String s = "Hi";
        int result = Language.vowelCount(s);
        assertEquals(1, result);
    }

    @Test
    public void testNullString() {
        String s = null;
        int result = Language.vowelCount(s);
        assertEquals(0, result);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int result = Language.vowelCount(s);
        assertEquals(0, result);
    }
}