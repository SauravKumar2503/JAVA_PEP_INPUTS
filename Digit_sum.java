//WAP to find the digit sum?
import java.util.*;
public class Digit_sum{
    public static void main(String[] args) {
      int n,r,sum=0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of the digits is: " + sum);  
    }
}