package easy.queue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumberOfRecentCallsTest {
    private final NumberOfRecentCalls test = new NumberOfRecentCalls();

    @Test
    void example1() {
        List<Integer> ping = List.of(
                test.ping(1),
                test.ping(100),
                test.ping(3001),
                test.ping(3002));
        assertArrayEquals(new Integer[]{1, 2, 3, 3}, ping.toArray());
    }

    @Test
    void example2() {
        List<Integer> ping = List.of(
                test.ping(1178),
                test.ping(1483),
                test.ping(1563),
                test.ping(4054),
                test.ping(4152));
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, ping.toArray());
    }

    @Test
    void example3() {
        List<Integer> ping = List.of(
                test.ping(642),
                test.ping(1849),
                test.ping(4921),
                test.ping(5936),
                test.ping(5957));
        assertArrayEquals(new Integer[]{1, 2, 1, 2, 3}, ping.toArray());
    }
}