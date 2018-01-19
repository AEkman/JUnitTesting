package com.andreasekman;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class LanguageTest {
    //Statement Coverage testing, 100% as fast as possible
    Language language;

    @BeforeClass
    public static void setup() {
        Language language = new Language();
    }

    @Test
    public void testStringIsNull(){
        String string = null;
        language.vowelCount(string);

        assertTrue(string == null);
    }

    @Test
    public void testStringIsEmpty(){

        String string = "test";
        int result = language.vowelCount(string);

        assertEquals(1, result);
    }


    // Old test
//    @Test
//    public void testStringWithSpecialCharacters() {
//        String s = "'-axzoO*åäö";
//        int result = 3;
//        assertEquals(3, result);
//    }
//
//    @Test
//    public void testStringWithUpperAndLowerCase() {
//        String s = "hElLo HeLlO";
//        int result = Language.vowelCount(s);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testStringWithManyVowels() {
//        String s = "Jakob";
//        int result = Language.vowelCount(s);
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void testStringWithOneVowel() {
//        String s = "Hi";
//        int result = Language.vowelCount(s);
//        assertEquals(1, result);
//    }
//
//    @Test
//    public void testNullString() {
//        String s = null;
//        int result = Language.vowelCount(s);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testEmptyString() {
//        String s = "";
//        int result = Language.vowelCount(s);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testClass() {
//        Language language = new Language();
//    }
}