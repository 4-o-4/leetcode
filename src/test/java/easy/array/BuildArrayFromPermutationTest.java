package easy.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {
    private BuildArrayFromPermutation buildArrayFromPermutation;

    @BeforeEach
    void init() {
        this.buildArrayFromPermutation = new BuildArrayFromPermutation();
    }

    @Test
    void buildArrayExample1() {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, buildArrayFromPermutation.buildArray(nums));
    }

    @Test
    void buildArrayExample2() {
        int[] nums = new int[]{5, 0, 1, 2, 3, 4};
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, buildArrayFromPermutation.buildArray(nums));
    }
}