//WAP that uses an assert statement to check if a number is positive.

public class Assert {
    public static void main(String[] args) {
        int number = -10;
        assert number > 0 : "Number is not positive";
        System.out.println("Number is positive");
    }
}

