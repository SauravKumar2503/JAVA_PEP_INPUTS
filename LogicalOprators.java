//Write a Java program that takes two boolean values as input and performs
// the logical AND, OR, and NOT operations on them.
// Constraints: The input boolean values should be either true or false.
// Test Cases:
// Input 1: bool1 = true, bool2 = true
// Output 1: Logical AND: true
// Logical OR: true
// Logical NOT for bool1: false
// Logical NOT for bool2: false
// Input 2: bool 1 = true, bool2 = false
// Output 2: Logical AND: false
// Logical OR: true
// Input 3: bool 1 = false, bool2 = true
// Output 3: Logical AND: false
// Logical OR: true
// Input 4: bool 1 = false, bool2 = false
// Output 4: Logical AND: false
// Logical OR: false

import java.util.Scanner;

public class LogicalOprators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first boolean value: ");
        boolean bool1 = sc.nextBoolean();
        System.out.println("Enter the second boolean value: ");
        boolean bool2 = sc.nextBoolean();
        sc.close();
        System.out.println("Logical AND: " + (bool1 && bool2));
        System.out.println("Logical OR: " + (bool1 || bool2));
        System.out.println("Logical NOT for bool1: " + !bool1);
        System.out.println("Logical NOT for bool2: " + !bool2);
    }
}