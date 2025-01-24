//WAP to check weather a number is amrstrong or not.
import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        int n,arm=0,rem,c;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }

    }
}