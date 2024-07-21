package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWordsContainingCharacterTest {
    private final FindWordsContainingCharacter test = new FindWordsContainingCharacter();

    @Test
    void example1() {
        String[] words = {"leet", "code"};
        char x = 'e';
        assertEquals(List.of(0, 1), test.findWordsContaining(words, x));
    }

    @Test
    void example2() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        assertEquals(List.of(0, 2), test.findWordsContaining(words, x));
    }

    @Test
    void example3() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';
        assertEquals(List.of(), test.findWordsContaining(words, x));
    }
}