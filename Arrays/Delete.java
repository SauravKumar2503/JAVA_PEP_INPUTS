//WAP to delete an element from an array at a specified position.

import java.util.*;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the element to be deleted: ");
        int pos = sc.nextInt();
        sc.close();
        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position!");
        } else {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("The array after deleting the element is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}