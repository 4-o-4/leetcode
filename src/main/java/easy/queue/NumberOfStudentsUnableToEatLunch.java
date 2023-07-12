package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int size = 0;

        for (int i : students)
            queue.add(i);
        for (int sandwich : sandwiches) {
            if (size == queue.size())
                return queue.size();
            size = queue.size();
            for (int j = 0; j < queue.size(); j++) {
                Integer e = queue.remove();
                if (sandwich == e)
                    break;
                else
                    queue.add(e);
            }
        }
        return queue.size();
    }
}
