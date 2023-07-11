package easy.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {
    private NumberOfRecentCalls numberOfRecentCalls;

    @BeforeEach
    void init() {
        this.numberOfRecentCalls = new NumberOfRecentCalls();
    }

    @Test
    void pingExample1() {
        List<Integer> ping = List.of(
                numberOfRecentCalls.ping(1),
                numberOfRecentCalls.ping(100),
                numberOfRecentCalls.ping(3001),
                numberOfRecentCalls.ping(3002));
        assertArrayEquals(new Integer[]{1, 2, 3, 3}, ping.toArray());
    }

    @Test
    void pingExample2() {
        List<Integer> ping = List.of(
                numberOfRecentCalls.ping(1178),
                numberOfRecentCalls.ping(1483),
                numberOfRecentCalls.ping(1563),
                numberOfRecentCalls.ping(4054),
                numberOfRecentCalls.ping(4152));
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, ping.toArray());
    }

    @Test
    void pingExample3() {
        List<Integer> ping = List.of(
                numberOfRecentCalls.ping(642),
                numberOfRecentCalls.ping(1849),
                numberOfRecentCalls.ping(4921),
                numberOfRecentCalls.ping(5936),
                numberOfRecentCalls.ping(5957));
        assertArrayEquals(new Integer[]{1, 2, 1, 2, 3}, ping.toArray());
    }
}