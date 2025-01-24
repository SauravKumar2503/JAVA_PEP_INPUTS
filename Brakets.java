//Write a program to check whether a sequence of brackets is balanced or not

import java.util.*;

public class Brakets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of brackets: ");
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        boolean isBalanced = true;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        sc.close();
        if (isBalanced) {
            System.out.println("The sequence of brackets is balanced.");
        } else {
            System.out.println("The sequence of brackets is not balanced.");
        }
    }
}