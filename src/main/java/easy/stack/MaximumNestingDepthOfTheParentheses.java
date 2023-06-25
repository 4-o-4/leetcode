package easy.stack;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push('(');
            else if (s.charAt(i) == ')')
                stack.pop();
            if (max < stack.size())
                max = stack.size();
        }
        return max;
    }
}
