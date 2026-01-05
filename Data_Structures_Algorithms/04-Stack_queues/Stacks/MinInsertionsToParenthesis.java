package Stack_queues.Stacks;
public class MinInsertionsToParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()())"));
    }

    public static int isValid(String s) {
        int insersions = 0;
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insersions++;
                }

                if (open > 0) {
                    open--;
                } else {

                    insersions++;
                }
            }
        }
        insersions += open * 2;
        return insersions;
    }
}
