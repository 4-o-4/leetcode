package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BuildArrayFromPermutationTest {
    private final BuildArrayFromPermutation solution = new BuildArrayFromPermutation();

    @Test
    void example1() {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, solution.buildArray(nums));
    }

    @Test
    void example2() {
        int[] nums = new int[]{5, 0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, solution.buildArray(nums));
    }
}