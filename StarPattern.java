//Develop a program to print the following pattern:
// +
// ++
// +++
// ++++

// import java.util.*;
// public class StarPattern{
//     public static void main(String[] args) {
//         int n;
//         System.out.println("Enter the number of rows: ");
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         sc.close();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("+");
//             }
//             System.out.println();
//         }
//     }
// }


//Write a program to print the following pattern using nested loops:

// ++++
// ++++
// ++++
// ++++

// import java.util.*;
// public class StarPattern{
//     public static void main(String[] args) {
//         int n;
//         System.out.println("Enter the number of rows: ");
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         sc.close();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("+");
//             }
//             System.out.println();
//         }
//     }
// }


//Develop a program to print the following pattern:
//    +
//   ++
//  +++
// ++++

import java.util.*;

public class StarPattern{
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
            for(int k=1;k<=i;k++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}