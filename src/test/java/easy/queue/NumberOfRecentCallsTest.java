package easy.queue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumberOfRecentCallsTest {
    private final NumberOfRecentCalls solution = new NumberOfRecentCalls();

    @Test
    void example1() {
        List<Integer> ping = List.of(
                solution.ping(1),
                solution.ping(100),
                solution.ping(3001),
                solution.ping(3002));
        assertArrayEquals(new Integer[]{1, 2, 3, 3}, ping.toArray());
    }

    @Test
    void example2() {
        List<Integer> ping = List.of(
                solution.ping(1178),
                solution.ping(1483),
                solution.ping(1563),
                solution.ping(4054),
                solution.ping(4152));
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, ping.toArray());
    }

    @Test
    void example3() {
        List<Integer> ping = List.of(
                solution.ping(642),
                solution.ping(1849),
                solution.ping(4921),
                solution.ping(5936),
                solution.ping(5957));
        assertArrayEquals(new Integer[]{1, 2, 1, 2, 3}, ping.toArray());
    }
}