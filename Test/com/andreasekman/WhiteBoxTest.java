package com.andreasekman;

import org.junit.Test;

public class WhiteBoxTest {

    // Testing Code Coverage
    @Test
    public void testWhiteBox1(){
        WhiteBox.russianMultiplication(3,3);
    }

    @Test
    public void testWhiteBox2(){
        WhiteBox whiteBox = new WhiteBox();

        whiteBox.russianMultiplication(3,3);
    }
}
