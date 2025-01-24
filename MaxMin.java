//WAP to create a method that will create Maximum and minimum array.

import java.util.*;
public class MaxMin{
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
        System.out.println();
        int max = a[0];
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
    }
}