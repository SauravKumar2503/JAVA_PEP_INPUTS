/* Multilevel Inheritance:
Create three classes:
Animal (with a move() method),
Bird (extends Animal and overrides move()),
Penguin (extends Bird and overrides move()).
Write a program to test method overriding in multilevel inheritance.


Constructor Chaining with Inheritance:
Create a Vehicle class with a parameterized constructor to initialize model and year.
Create a subclass Car with an additional brand attribute and a parameterized constructor. Call the Vehicle constructor using super() in the Car constructor.
*/
//java

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
}
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}
class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Penguin swims");
    }
}
 class Multilevel {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.move();
    }
}