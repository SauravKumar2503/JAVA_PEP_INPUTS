import java.util.*;
class C{
    String name;
    int price;
    C(){
    }
    C(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }
}

class Car{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars: ");
        int n = sc.nextInt();
        C[] cars = new C[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the name of the car: ");
            String name = sc.next();
            System.out.println("Enter the price of the car: ");
            int price = sc.nextInt();
            cars[i] = new C(name, price);
        }
        sc.close();
        for(int i=0; i<n; i++){
            System.out.println("Name of the car: "+cars[i].name);
            System.out.println("Price of the car: "+cars[i].price);
            cars[i].startEngine();
        }
    }
}