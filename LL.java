// Create a linked list of strings,add monday,tuesday and wednesday to the list. Retrieve and print the first element of the list.

// import java.util.LinkedList;

// public class LL {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();
//         list.add("Monday");
//         list.add("Tuesday");
//         list.add("Wednesday");
//         System.out.println(list.get(0));
//     }
// }


// Create a LL of integers with the elements 5,10 and 15. Replace 10 with 20 and print the updated list.


// import java.util.LinkedList;

// public class LL {
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(5);
//         list.add(10);
//         list.add(15);
//         list.set(1, 20);
//         System.out.println(list);
//     }
// }

// Create a LL of strings with the element one,two and four. Add three to the list and print the updated list.

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Four");
        list.add("Three");
        System.out.println(list);
    }
}