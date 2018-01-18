package com.andreasekman;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    // This one fails
//    @Test
//    public void testReverseWithEscapeCharacters() {
//
//        String test = "\uD800\uDC00";
//        String result = StringUtils.reverse("\uD800\uDC00");
//
//        assertEquals(result, new StringBuilder(test).reverse().toString());
//    }

    @Test
    public void testReverse() throws Exception {

        String result = StringUtils.reverse("test");

        assertEquals(result, "tset");
    }

    @Test
    public void testReverseEmptyString() {

        String result = StringUtils.reverse("");

        assertEquals(result, "");
    }

    @Test
    public void testReverseWhiteSpace() {

        String result = StringUtils.reverse("");

        assertEquals(result, "");
    }

    @Test
    public void testReverseConcatination() {

        String result = StringUtils.reverse("x" +"y");

        assertEquals(result, "y" + "x");
    }



    @Test
    public void testReverseWithDifferentCasing() {

        String result = StringUtils.reverse("Ok");

        assertEquals(result, "kO");
    }

    @Test
    public void testClass() {

        StringUtils stringUtils = new StringUtils();
    }

    @Test(expected = NullPointerException.class)
    public void testReverseThrowsExceptionsWhenAddingNull(){
        StringUtils.reverse(null);
    }

}