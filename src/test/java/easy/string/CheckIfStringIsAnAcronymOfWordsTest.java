package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfStringIsAnAcronymOfWordsTest {
    private final CheckIfStringIsAnAcronymOfWords test = new CheckIfStringIsAnAcronymOfWords();

    @Test
    void example1() {
        List<String> words = List.of("alice", "bob", "charlie");
        String s = "abc";
        assertTrue(test.isAcronym(words, s));
    }

    @Test
    void example2() {
        List<String> words = List.of("an", "apple");
        String s = "a";
        assertFalse(test.isAcronym(words, s));
    }

    @Test
    void example3() {
        List<String> words = List.of("never", "gonna", "give", "up", "on", "you");
        String s = "ngguoy";
        assertTrue(test.isAcronym(words, s));
    }
}