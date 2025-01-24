//Write a program to convert a number given in string form to its corresponding integer.
//Hint: Convert characters to equivalent integers and multiply by an appropriate power of 10.


import java.util.*;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in string form: ");
        String str = sc.next();
        int num = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            num = num * 10 + (str.charAt(i) - '0');
        }
        sc.close();
        System.out.println("The number in integer form is: " + num);
    }
}