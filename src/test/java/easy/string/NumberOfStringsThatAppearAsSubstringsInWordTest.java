package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStringsThatAppearAsSubstringsInWordTest {
    private final NumberOfStringsThatAppearAsSubstringsInWord solution = new NumberOfStringsThatAppearAsSubstringsInWord();

    @Test
    void example1() {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        assertEquals(3, solution.numOfStrings(patterns, word));
    }

    @Test
    void example2() {
        String[] patterns = {"a", "b", "c"};
        String word = "aaaaabbbbb";
        assertEquals(2, solution.numOfStrings(patterns, word));
    }

    @Test
    void example3() {
        String[] patterns = {"a", "a", "a"};
        String word = "ab";
        assertEquals(3, solution.numOfStrings(patterns, word));
    }
}