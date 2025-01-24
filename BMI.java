//Write a Java program to calculate the BMI (Body Mass Index) based on
// weight and height inputs. Ensure that weight and height are within valid ranges.

// Constraints:
// Weight (W) and height (H) are positive decimal values.
// 0 < W < 500
// 0 < H < 3.0

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println("Enter the height in meters: ");
        double height = sc.nextDouble();
        sc.close();

        if(weight <= 0 || weight >= 500 || height <= 0 || height >= 3.0){
            System.out.println("Invalid Input");
        }
        else{
            double bmi = weight / (height * height);
            System.out.println("BMI is: " + bmi);
        }
    }
}