//Write a program to reverse a string using a for loop.

import java.util.*;
public class reverse{
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        sc.close();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
