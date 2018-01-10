package com.andreasekman;

import static org.hamcrest.MatcherAssert.assertThat;

public class Triangles {

    public static boolean isIscoscelesTriangle(double a, double b, double c){

        if (a <= 0 || b <= 0 || c <= 0) {
            return false; // added test
        } else if (a == b && b == c) {
            return false;
        } else if (a >= b+c || c >= b+a || b >= a+c) {
            return false;
        } else if (b==c || a==b || c==a) {
            return true;
        } else {
            return false;
        }
    }
}
