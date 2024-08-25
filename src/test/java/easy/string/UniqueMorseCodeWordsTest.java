package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueMorseCodeWordsTest {
    private final UniqueMorseCodeWords solution = new UniqueMorseCodeWords();

    @Test
    void example1() {
        String[] words = {"gin", "zen", "gig", "msg"};
        assertEquals(2, solution.uniqueMorseRepresentations(words));
    }

    @Test
    void example2() {
        String[] words = {"a"};
        assertEquals(1, solution.uniqueMorseRepresentations(words));
    }
}