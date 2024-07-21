package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfGoodPairsTest {
    private final NumberOfGoodPairs test = new NumberOfGoodPairs();

    @Test
    void example1() {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        assertEquals(4, test.numIdenticalPairs(nums));
    }

    @Test
    void example2() {
        int[] nums = new int[]{1, 1, 1, 1};
        assertEquals(6, test.numIdenticalPairs(nums));
    }

    @Test
    void example3() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(0, test.numIdenticalPairs(nums));
    }
}