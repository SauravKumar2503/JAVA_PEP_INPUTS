//Write a program to count the occurrences of a specific digit in a number using a while loop.

// Input: Number = 123451234, Digit = 2
// Output: 2 occurrences of 2

import java.util.*;
public class counter{
    public static void main(String[] args) {
        int n,digit,count=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the digit: ");
        digit=sc.nextInt();
        sc.close();
        while(n>0){
            if(n%10==digit){
                count++;
            }
            n=n/10;
        }
        System.out.println(count+" occurrences of "+digit);
    }
}