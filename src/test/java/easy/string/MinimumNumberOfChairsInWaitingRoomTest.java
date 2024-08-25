package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfChairsInWaitingRoomTest {
    private final MinimumNumberOfChairsInWaitingRoom solution = new MinimumNumberOfChairsInWaitingRoom();

    @Test
    void example1() {
        String s = "EEEEEEE";
        assertEquals(7, solution.minimumChairs(s));
    }

    @Test
    void example2() {
        String s = "ELELEEL";
        assertEquals(2, solution.minimumChairs(s));
    }

    @Test
    void example3() {
        String s = "ELEELEELLL";
        assertEquals(3, solution.minimumChairs(s));
    }
}