package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaximumNumberOfStringPairsTest {
    private final FindMaximumNumberOfStringPairs solution = new FindMaximumNumberOfStringPairs();

    @Test
    void example1() {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        assertEquals(2, solution.maximumNumberOfStringPairs(words));
    }

    @Test
    void example2() {
        String[] words = {"ab", "ba", "cc"};
        assertEquals(1, solution.maximumNumberOfStringPairs(words));
    }

    @Test
    void example3() {
        String[] words = {"aa", "ab"};
        assertEquals(0, solution.maximumNumberOfStringPairs(words));
    }

    @Test
    void example4() {
        String[] words = {"cd", "zz", "ac", "dc", "ca", "zz"};
        assertEquals(3, solution.maximumNumberOfStringPairs(words));
    }
}