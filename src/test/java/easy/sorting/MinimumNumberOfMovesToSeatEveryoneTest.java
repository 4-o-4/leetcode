package easy.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfMovesToSeatEveryoneTest {
    private MinimumNumberOfMovesToSeatEveryone minimumNumberOfMovesToSeatEveryone;

    @BeforeEach
    void init() {
        this.minimumNumberOfMovesToSeatEveryone = new MinimumNumberOfMovesToSeatEveryone();
    }

    @Test
    void minMovesToSeatExample1() {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        assertEquals(4, minimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }

    @Test
    void minMovesToSeatExample2() {
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        assertEquals(7, minimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }

    @Test
    void minMovesToSeatExample3() {
        int[] seats = {2, 2, 6, 6};
        int[] students = {1, 3, 2, 6};
        assertEquals(4, minimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students));
    }
}