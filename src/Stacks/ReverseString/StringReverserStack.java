package Stacks.ReverseString;

import java.util.Stack;

public class StringReverserStack {
    public String reverse(String input){
        if(input == null)
            throw  new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for(char c: input.toCharArray()){
            stack.push(c);
        }

        StringBuffer reverse = new StringBuffer();
        while (!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
