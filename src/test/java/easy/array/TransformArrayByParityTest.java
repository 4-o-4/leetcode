package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TransformArrayByParityTest {
    private final TransformArrayByParity solution = new TransformArrayByParity();

    @Test
    void example1() {
        int[] nums = {4, 3, 2, 1};
        assertArrayEquals(new int[]{0, 0, 1, 1}, solution.transformArray(nums));
    }

    @Test
    void example2() {
        int[] nums = {1, 5, 1, 4, 2};
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, solution.transformArray(nums));
    }
}