package easy.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfRecentCalls {
    private static final int milliseconds = 3000;
    private final Queue<Integer> queue = new PriorityQueue<>();

    public NumberOfRecentCalls() {
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty()) {
            if (queue.peek() >= t - milliseconds && queue.peek() <= t)
                break;
            else
                queue.remove();
        }
        return queue.size();
    }
}
