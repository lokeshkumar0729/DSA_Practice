package Stack_queues.Stacks;

import java.util.Stack;

public class ValidParenthesisMinAdd {
    public static void main(String[] args) {

    }

    public int idValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
