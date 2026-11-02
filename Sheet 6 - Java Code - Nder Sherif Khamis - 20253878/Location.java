/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns in the array: ");
        int n = input.nextInt();

        double[] values = new double[n];

        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextDouble();
        }

        Location location = new Location();
        location.locateLargest(values);

        System.out.println("The location of the largest element is "
                + location.getMaxValue()
                + " at position ("
                + location.getColumn() + ")");

        input.close();
    }
}