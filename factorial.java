//WAP to calculate the factorial of a given number?

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial: ");
        int num = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }
}