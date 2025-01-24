//WAP to find the number is odd or even?
import java.util.*;
public class Oddeven{
    public static void main(String[] args) {
    
    int n;
    System.out.println("Enter a number:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.close();
    if(n%2==0){
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }
}
}