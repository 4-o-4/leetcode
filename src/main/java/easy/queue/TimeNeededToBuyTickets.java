package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;

        for (int i : tickets)
            queue.add(i);
        while (true) {
            Integer e = queue.remove();
            if (e != 0) {
                time++;
                queue.add(e - 1);
                if (k == 0 && e - 1 == 0)
                    break;
                else if (k == 0)
                    k = queue.size();
            }
            k--;
        }
        return time;
    }
}
