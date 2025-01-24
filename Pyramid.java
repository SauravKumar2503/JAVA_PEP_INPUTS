//WAP to print the Pyramid pattern.

import java.util.*;
public class Pyramid{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}