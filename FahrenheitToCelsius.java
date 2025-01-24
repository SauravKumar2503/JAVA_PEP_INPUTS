//Write a Java program to convert the temperature from Fahrenheit to
// Celsius. Ensure that the input Fahrenheit temperature is within a valid range.

// Constraints:
// Fahrenheit temperature (F) is a decimal value.
// -100 <= F <= 300

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fah = sc.nextDouble();
        sc.close();

        if(fah < -100 || fah > 300){
            System.out.println("Invalid Input");
        }
        else{
            double celsius = (fah - 32) * 5/9;
            System.out.println("Temperature in Celsius is: " + celsius);
        }
    }
}