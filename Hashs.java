//Create a Hastset of integers. Add 1,2 and 3 to the list. Print the elements and observe the order.

// import java.util.HashSet;

// public class Hashs {
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(1);
//         set.add(2);
//         set.add(3);
//         System.out.println(set);
//     }
// }

//Create a Hashset of strings with the elements Dog,Cat and Bird.check if cat exists in the set and print the result.

import java.util.HashSet;

public class Hashs {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        System.out.println(set.contains("Cat"));
    }
}