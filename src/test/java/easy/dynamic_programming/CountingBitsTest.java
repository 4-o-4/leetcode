package easy.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {
    private final CountingBits solution = new CountingBits();

    @Test
    void example1() {
        int n = 2;
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(n));
    }

    @Test
    void example2() {
        int n = 5;
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(n));
    }
}