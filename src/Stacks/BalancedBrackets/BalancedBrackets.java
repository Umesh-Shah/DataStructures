package Stacks.BalancedBrackets;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {


    public boolean balanced(String input){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(char c: input.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            } else if(map.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }
                char c1 = stack.pop();
                if(c1 != map.get(c)){
                    return false;
                }
            }
        }
        return true;
    }
}
