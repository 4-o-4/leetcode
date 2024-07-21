package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    private final ReversePrefixOfWord test = new ReversePrefixOfWord();

    @Test
    void example1() {
        String word = "abcdefd";
        char ch = 'd';
        assertEquals("dcbaefd", test.reversePrefix(word, ch));
    }

    @Test
    void example2() {
        String word = "xyxzxe";
        char ch = 'z';
        assertEquals("zxyxxe", test.reversePrefix(word, ch));
    }

    @Test
    void example3() {
        String word = "abcd";
        char ch = 'z';
        assertEquals("abcd", test.reversePrefix(word, ch));
    }

    @Test
    void example4() {
        String word = "abcd";
        char ch = 'd';
        assertEquals("dcba", test.reversePrefix(word, ch));
    }
}