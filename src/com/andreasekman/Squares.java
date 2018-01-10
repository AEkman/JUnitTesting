package com.andreasekman;

public class Squares {

    public static boolean isSquare(double a, double b){

        if(a <= 0 || b <= 0)
        {
            return false;
        } else if (a == b){
            return true;
        } else {
            return false;
        }

    }
}
