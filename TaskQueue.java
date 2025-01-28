//WAP to demonstrate the example of Linkedlistqueue using offer,peek 

// import java.util.LinkedList;

// public class LLQueue {
//     public static void main(String[] args) {
//         LinkedList<String> ll = new LinkedList<String>();
//         ll.offer("A");
//         ll.offer("B");
//         ll.offer("C");
//         ll.offer("D");
//         ll.offer("E");
//         System.out.println("Elements in the queue: " + ll);
//         System.out.println("Head element of the queue: " + ll.peek());
//     }
// }


//Create a program to simulte a task queue:
//use a LL to manage task (strin value like "Task1","Task2","Task3")}.
//Add the following taska to the queue in order: "Dowland file","Process file","Upload file".Performs the following actions:
//Peek at the first task in the queue without it.
//remove the first task in the queue.Check if the queue is empty after each iteration.Print the queue after each operation.

import java.util.LinkedList;

public class TaskQueue {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.offer("Download file");
        ll.offer("Process file");
        ll.offer("Upload file");
        System.out.println("Elements in the queue: " + ll);
        System.out.println("Head element of the queue: " + ll.peek());
        ll.poll();
        System.out.println("Elements in the queue: " + ll);
        System.out.println("Head element of the queue: " + ll.peek());
        ll.poll();
        System.out.println("Elements in the queue: " + ll);
        System.out.println("Head element of the queue: " + ll.peek());
        ll.poll();
        System.out.println("Elements in the queue: " + ll);
    }
}

