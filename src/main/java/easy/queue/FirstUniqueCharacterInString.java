package easy.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++)
            queue.add(s.charAt(i));
        for (int i = 0; i < queue.size(); i++) {
            Character remove = queue.remove();
            for (Character q : queue)
                if (remove == q) {
                    queue.add(remove);
                    break;
                }
            if (s.length() != queue.size())
                return i;
        }
        return -1;
    }
}
