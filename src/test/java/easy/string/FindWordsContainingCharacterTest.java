package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWordsContainingCharacterTest {
    private final FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();

    @Test
    void Example1() {
        String[] words = {"leet", "code"};
        char x = 'e';
        assertEquals(List.of(0, 1), findWordsContainingCharacter.findWordsContaining(words, x));
    }

    @Test
    void Example2() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        assertEquals(List.of(0, 2), findWordsContainingCharacter.findWordsContaining(words, x));
    }

    @Test
    void Example3() {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';
        assertEquals(List.of(), findWordsContainingCharacter.findWordsContaining(words, x));
    }
}