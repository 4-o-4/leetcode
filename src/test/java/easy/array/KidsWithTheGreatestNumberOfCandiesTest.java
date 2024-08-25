package easy.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWithTheGreatestNumberOfCandiesTest {
    private final KidsWithTheGreatestNumberOfCandies solution = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void example1() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        assertEquals(List.of(true, true, true, false, true), solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void example2() {
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;
        assertEquals(List.of(true, false, false, false, false), solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void example3() {
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;
        assertEquals(List.of(true, false, true), solution.kidsWithCandies(candies, extraCandies));
    }
}