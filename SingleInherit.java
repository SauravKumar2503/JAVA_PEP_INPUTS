class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
class Parent {
    public void greet() {
        System.out.println("Hello from Parent.");
    }
}
class Child extends Parent {
}
class SingleInherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Child child = new Child();
        child.greet();
    }
}
