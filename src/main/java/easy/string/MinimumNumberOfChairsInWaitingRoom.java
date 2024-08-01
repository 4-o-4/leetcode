package easy.string;

public class MinimumNumberOfChairsInWaitingRoom {
    public int minimumChairs(String s) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                min++;
                if (min > max)
                    max = min;
            } else
                min--;
        }
        return max;
    }
}
