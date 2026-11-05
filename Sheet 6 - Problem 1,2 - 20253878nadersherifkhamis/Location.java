/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;

/**
 *
 * @author STUDENT
 */

import java.util.Scanner;

class Location {
    private double maxValue;
    private int column;

    public double getMaxValue() {
        return maxValue;
    }

    public int getColumn() {
        return column;
    }

    public void locateLargest(double[] values) {
        maxValue = values[0];
        column = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                column = i;
            }
        }
    }
}

   