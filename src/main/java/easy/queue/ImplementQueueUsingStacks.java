package easy.queue;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> tmp = new Stack<>();

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        int size = stack.size() != 0 ? stack.size() : 0;
        int pop = 0;
        if (size != 0) {
            for (int i = 0; i < size - 1; i++)
                tmp.push(stack.pop());
            pop = stack.pop();
            size = tmp.size();
            for (int i = 0; i < size; i++)
                stack.push(tmp.pop());
        }
        return pop;
    }

    public int peek() {
        int peek = 0;
        for (Integer integer : stack) {
            peek = integer;
            break;
        }
        return peek;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
