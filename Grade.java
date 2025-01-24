//Write a program to take a student's score as input and print their grade based on the following criteria:

// A: 90 and above
// B: 80 to 89
// C: 70 to 79
// D: 60 to 69
// F: Below 60


import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's score: ");
        int score = sc.nextInt();
        sc.close();
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}