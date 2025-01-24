//Write a program to convert a decimal number to binary using a while loop.

// Input: 10
// Output: 1010

import java.util.*;
public class DecToBin{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        int binary=0,rem,place=1;
        while(n>0){
            rem=n%2;
            binary=binary+rem*place;
            place=place*10;
            n=n/2;
        }
        System.out.println("Binary: "+binary);
    }
}