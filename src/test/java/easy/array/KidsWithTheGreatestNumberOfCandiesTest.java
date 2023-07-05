package easy.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {
    private KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies;

    @BeforeEach
    void init() {
        this.kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
    }

    @Test
    void kidsWithCandiesExample1() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        assertEquals(List.of(true, true, true, false, true), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void kidsWithCandiesExample2() {
        int[] candies = new int[]{4, 2, 1, 1, 2};
        int extraCandies = 1;
        assertEquals(List.of(true, false, false, false, false), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void kidsWithCandiesExample3() {
        int[] candies = new int[]{12, 1, 12};
        int extraCandies = 10;
        assertEquals(List.of(true, false, true), kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }
}