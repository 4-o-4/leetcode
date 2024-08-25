package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    private final ReversePrefixOfWord solution = new ReversePrefixOfWord();

    @Test
    void example1() {
        String word = "abcdefd";
        char ch = 'd';
        assertEquals("dcbaefd", solution.reversePrefix(word, ch));
    }

    @Test
    void example2() {
        String word = "xyxzxe";
        char ch = 'z';
        assertEquals("zxyxxe", solution.reversePrefix(word, ch));
    }

    @Test
    void example3() {
        String word = "abcd";
        char ch = 'z';
        assertEquals("abcd", solution.reversePrefix(word, ch));
    }

    @Test
    void example4() {
        String word = "abcd";
        char ch = 'd';
        assertEquals("dcba", solution.reversePrefix(word, ch));
    }
}