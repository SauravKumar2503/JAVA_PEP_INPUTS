//WAP to create a table of a number entered by the user.
import java.util.*;
public class Table{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        sc.close();

        for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
