package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfChairsInWaitingRoomTest {
    private final MinimumNumberOfChairsInWaitingRoom test = new MinimumNumberOfChairsInWaitingRoom();

    @Test
    void example1() {
        String s = "EEEEEEE";
        assertEquals(7, test.minimumChairs(s));
    }

    @Test
    void example2() {
        String s = "ELELEEL";
        assertEquals(2, test.minimumChairs(s));
    }

    @Test
    void example3() {
        String s = "ELEELEELLL";
        assertEquals(3, test.minimumChairs(s));
    }
}