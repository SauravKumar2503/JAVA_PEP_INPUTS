//Write a program to find the longest common prefix of two strings

import java.util.*;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.next();
        System.out.println("Enter the second string: ");
        String str2 = sc.next();
        int n1 = str1.length();
        int n2 = str2.length();
        int n = Math.min(n1, n2);
        int i = 0;
        while (i < n && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        sc.close();
        System.out.println("The longest common prefix is: " + str1.substring(0, i));
    }
}