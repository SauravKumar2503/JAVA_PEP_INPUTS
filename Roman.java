//Write a program to convert an integer to a Roman number

import java.util.*;

public class Roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        String[] roman = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int[] value = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        StringBuilder sb = new StringBuilder();
        int i = 12;
        while (num > 0) {
            int div = num / value[i];
            num %= value[i];
            while (div-- > 0) {
                sb.append(roman[i]);
            }
            i--;
        }
        sc.close();
        System.out.println("The Roman number is: " + sb.toString());
    }
}