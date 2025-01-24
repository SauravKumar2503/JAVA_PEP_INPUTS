//WAP to create array input should be given by user and then traverse the array.

import java.util.*;
public class Arraytraverse{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements in array: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Array Elements: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}