package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaximumNumberOfStringPairsTest {
    private final FindMaximumNumberOfStringPairs test = new FindMaximumNumberOfStringPairs();

    @Test
    void example1() {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        assertEquals(2, test.maximumNumberOfStringPairs(words));
    }

    @Test
    void example2() {
        String[] words = {"ab", "ba", "cc"};
        assertEquals(1, test.maximumNumberOfStringPairs(words));
    }

    @Test
    void example3() {
        String[] words = {"aa", "ab"};
        assertEquals(0, test.maximumNumberOfStringPairs(words));
    }

    @Test
    void example4() {
        String[] words = {"cd", "zz", "ac", "dc", "ca", "zz"};
        assertEquals(3, test.maximumNumberOfStringPairs(words));
    }
}