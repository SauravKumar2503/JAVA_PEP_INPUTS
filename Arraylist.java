//Create an ArrayList of integers.Add the numbers 10,20,and 30 to the list.Retrieve and print the second element of the list.

// import java.util.ArrayList;

// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         System.out.println(list.get(1));
//     }
// }


//Create an ArraList of strings with the element.Red,blue and green. Replace blue with yelllow and print the updated list.

// import java.util.ArrayList;

// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Red");
//         list.add("Blue");
//         list.add("Green");
//         list.set(1, "Yellow");
//         System.out.println(list);
//     }
// }



//Create an arraylist having functions of add element, get element, size of arraylist and remove last element

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(list.size()-1);
        System.out.println(list);
    }
}