//WAP to traverse 2D array.
import java.util.*;
public class ToDArray{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println("Matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
