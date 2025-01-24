//○ Create an abstract class Shape with an abstract method draw().
//Extend it with Circle and Rectangle classes, implementing the draw()
//method.
//Test them in a main method.


// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing Circle");
//     }
// }

// class Rectangle extends Shape {
//     void draw() {
//         System.out.println("Drawing Rectangle");
//     }
// }

// public class Abstract {
//     public static void main(String[] args) {
//         Shape s1 = new Circle();
//         s1.draw();
//         Shape s2 = new Rectangle();
//         s2.draw();
//     }
// }


//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are
// deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class
// 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each
// of the three classes.


abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("$100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("$150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}

public class Abstract {
    public static void main(String[] args) {
        BankA a = new BankA();
        a.getBalance();
        BankB b = new BankB();
        b.getBalance();
        BankC c = new BankC();
        c.getBalance();
    }
}