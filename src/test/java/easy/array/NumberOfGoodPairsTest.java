package easy.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {
    private NumberOfGoodPairs numberOfGoodPairs;

    @BeforeEach
    void init() {
        this.numberOfGoodPairs = new NumberOfGoodPairs();
    }

    @Test
    void numIdenticalPairsExample1() {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        assertEquals(4, numberOfGoodPairs.numIdenticalPairs(nums));
    }

    @Test
    void numIdenticalPairsExample2() {
        int[] nums = new int[]{1, 1, 1, 1};
        assertEquals(6, numberOfGoodPairs.numIdenticalPairs(nums));
    }

    @Test
    void numIdenticalPairsExample3() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(0, numberOfGoodPairs.numIdenticalPairs(nums));
    }
}