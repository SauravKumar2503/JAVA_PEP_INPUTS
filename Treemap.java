//WAP to store words as keys and their lengths as values in a Treemap.Print the map to observe the order of the keys.

// import java.util.TreeMap;

// public class Treemap {
//     public static void main(String[] args) {
//         TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
//         tm.put("Apple", 5);
//         tm.put("Banana", 6);
//         tm.put("Cherry", 6);
//         System.out.println("Elements in the queue: " + tm);
//     }
// }

//Find the first and the last key.WAP to store employee IDs as keys and their names as values in a Treemap.FInd and print the first and last key in the map.

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1, "John");
        tm.put(2, "Doe");
        tm.put(3, "Jane");
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());
    }
}