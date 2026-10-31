/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Problem1{

public static double getDouble(Scanner s, String prompt) {
    System.out.print(prompt);
    return s.nextDouble();
}

public static double celsiusToFahrenheit(double c) {
    return c * 9.0 / 5.0 + 32;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double celsius = getDouble(input, "Enter temperature in Celsius: ");
    double fahrenheit = celsiusToFahrenheit(celsius);

    System.out.printf("Fahrenheit: %.2f%n", fahrenheit);

    input.close();
}

}