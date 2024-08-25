package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetermineIfStringHalvesAreAlikeTest {
    private final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();

    @Test
    void example1() {
        String s = "book";
        assertTrue(solution.halvesAreAlike(s));
    }

    @Test
    void example2() {
        String s = "textbook";
        assertFalse(solution.halvesAreAlike(s));
    }
}