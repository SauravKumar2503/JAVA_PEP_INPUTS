//Use inheritance to extend a Vehicle class into a Car class.
//Demonstrate Car objects calling methods from both Vehicle and Car.

// import java.util.Scanner;

// class Vehicle {
//     int passengers;
//     int fuelcap;
//     int mpg;

//     Vehicle(int p, int f, int m) {
//         passengers = p;
//         fuelcap = f;
//         mpg = m;
//     }

//     int range() {
//         return mpg * fuelcap;
//     }

//     double fuelneeded(int miles) {
//         return (double) miles / mpg;
//     }
// }

// class Car extends Vehicle {
//     int passengers;
//     int fuelcap;
//     int mpg;

//     Car(int p, int f, int m) {
//         super(p, f, m);
//     }
// }

// class Inheritance{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of passengers, fuel capacity and mileage of the car: ");
//         int p = sc.nextInt();
//         int f = sc.nextInt();
//         int m = sc.nextInt();
//         Car c = new Car(p, f, m);
//         System.out.println("The range of the car is: " + c.range());
//         System.out.println("The fuel needed for 100 miles is: " + c.fuelneeded(100));
//         sc.close();
//     }
// }





//Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three
// fields. This class also has a method “volume()” to calculate the volume of this room. Create
// another class “RoomDemo” which will use the earlier class, create instances of rooms, and
// display the volume of room.


class Room {
    private double height;
    private double width;
    private double breadth;

    
    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    
    public double volume() {
        return height * width * breadth;
    }
}

public class RoomDemo {
    public static void main(String[] args) {
        
        Room room1 = new Room(10, 15, 20); 
        Room room2 = new Room(12, 14, 18); 

        
        System.out.println("Volume of Room 1: " + room1.volume() + " cubic units");
        System.out.println("Volume of Room 2: " + room2.volume() + " cubic units");
    }
}
