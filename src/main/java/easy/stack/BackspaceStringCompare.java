package easy.stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        extracted(s, stackS);
        extracted(t, stackT);
        return stackS.toString().contains(stackT.toString());
    }

    private void extracted(String s, Stack<Character> stack) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#')
                stack.push(s.charAt(i));
            else if (!stack.isEmpty())
                stack.pop();
        }
    }
}
