package easy.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] arr = new char[]{'(', ')', '[', ']', '{', '}'};
        Stack<Integer> stack = new Stack<>();
        Integer c = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < arr.length; j += 2) {
                if (s.charAt(i) == arr[j]) {
                    c = j;
                    break;
                }
            }
            if (c == null && stack.isEmpty()) {
                return false;
            } else if (c != null) {
                stack.push(c);
                c = null;
            } else {
                if (arr[stack.peek() + 1] != s.charAt(i)) {
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
