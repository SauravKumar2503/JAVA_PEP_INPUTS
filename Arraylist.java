//Create an ArrayList of integers.Add the numbers 10,20,and 30 to the list.Retrieve and print the second element of the list.

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1));
    }
}