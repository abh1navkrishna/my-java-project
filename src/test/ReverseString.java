package test;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String name = "abhinav";
        String revString = "";
        Stack<Character> stack = new Stack<>();

        for (char ch : name.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            revString+=stack.pop();
            
        }

        System.out.println("-------"+revString);

    }
}
