package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    private final ReversePrefixOfWord reversePrefixOfWord = new ReversePrefixOfWord();

    @Test
    void Example1() {
        String word = "abcdefd";
        char ch = 'd';
        assertEquals("dcbaefd", reversePrefixOfWord.reversePrefix(word, ch));
    }

    @Test
    void Example2() {
        String word = "xyxzxe";
        char ch = 'z';
        assertEquals("zxyxxe", reversePrefixOfWord.reversePrefix(word, ch));
    }

    @Test
    void Example3() {
        String word = "abcd";
        char ch = 'z';
        assertEquals("abcd", reversePrefixOfWord.reversePrefix(word, ch));
    }

    @Test
    void Example4() {
        String word = "abcd";
        char ch = 'd';
        assertEquals("dcba", reversePrefixOfWord.reversePrefix(word, ch));
    }
}