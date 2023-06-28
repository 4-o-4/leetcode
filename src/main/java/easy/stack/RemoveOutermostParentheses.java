package easy.stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                if (!stack.isEmpty())
                    sb.append(c);
                stack.push('(');
            } else {
                if (stack.size() != 1)
                    sb.append(c);
                stack.pop();
            }
        }
        return sb.toString();
    }
}
