//WAP to demonstrate the use of annotations in Java.

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int value();
}

public class Annotations {
    @MyAnnotation(value = 10)
    public void myMethod() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Annotations obj = new Annotations();
        obj.myMethod();
    }
}

