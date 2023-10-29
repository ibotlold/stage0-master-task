package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x * y == 0) {
            System.out.println("zero");
            return;
        }
        if (x * y > 0) {
            if (x > 0) {
                System.out.println("first");
            } else {
                System.out.println("third");
            }
        } else {
            if (y > 0) {
                System.out.println("second");
            } else {
                System.out.println("fourth");
            }
        }
    }

}

