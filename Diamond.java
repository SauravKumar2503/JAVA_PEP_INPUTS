//WAP to print the Diamond pattern.

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}