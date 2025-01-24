//Write a Java program to calculate the simple interest for a given principal
// amount, rate of interest, and time period. Ensure that the input values are valid and
// non-negative.

// Constraints:
// 0 <= P <= 100000
// 0 <= R <= 100
// 0 <= T <= 30


import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time period: ");
        double time = sc.nextDouble();
        sc.close();

        if(principal < 0 || principal > 100000 || rate < 0 || rate > 100 || time < 0 || time > 30){
            System.out.println("Invalid Input");
        }
        else{
            double simpleIntrest = (principal * rate * time) / 100;
            System.out.println("Simple Intrest is: " + simpleIntrest);
        }
    }
}