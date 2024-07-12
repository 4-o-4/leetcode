package easy.sorting;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        int min = 0;
        if (seats.length == 0)
            return min;

        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++)
            min += seats[i] < students[i] ? students[i] - seats[i] : seats[i] - students[i];
        return min;
    }
}
