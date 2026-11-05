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
public class JavaApplication25 {
    
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of columns in the array: ");
        int n = input.nextInt();

        double[] values = new double[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextDouble();
        }

        Location location = new Location();

        location.locateLargest(values);

        System.out.println("The location of the largest element is "
                + location.getMaxValue()
                + " at position (" + location.getColumn() + ")");

        input.close();
    }
}
    



