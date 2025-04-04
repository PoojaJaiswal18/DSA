package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        if (str.length() % 2 != 0) {
            return false;
        } else {

            if (str.charAt(0) == ']' || str.charAt(0) == ')' || str.charAt(0) == '}') {
                return false;
            }

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if (((str.charAt(i) == ')' && stack.peek() == '(')) || ((str.charAt(i) == '}' && stack.peek() == '{')) || (str.charAt(i) == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }


            return true;

        }


    }

    public static void main(String[] args) {
        boolean b=isValid("}{}{");

        System.out.println(b);
    }

}
