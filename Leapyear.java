//WAP to check weather a number is leap year or not.

import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            } else
                System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
            sc.close();
    }
    
}