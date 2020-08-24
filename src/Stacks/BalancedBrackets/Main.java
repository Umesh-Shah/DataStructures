package Stacks.BalancedBrackets;

public class Main {
    public static void main(String[] args) {
        String str = "1+2()";
        BalancedBrackets bb = new BalancedBrackets();
        System.out.println(bb.balanced(str));
    }
}
