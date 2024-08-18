package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfWordEqualsSummationOfTwoWordsTest {
    private final CheckIfWordEqualsSummationOfTwoWords test = new CheckIfWordEqualsSummationOfTwoWords();

    @Test
    void example1() {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        assertTrue(test.isSumEqual(firstWord, secondWord, targetWord));
    }

    @Test
    void example2() {
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aab";
        assertFalse(test.isSumEqual(firstWord, secondWord, targetWord));
    }

    @Test
    void example3() {
        String firstWord = "aaa";
        String secondWord = "a";
        String targetWord = "aaaa";
        assertTrue(test.isSumEqual(firstWord, secondWord, targetWord));
    }

    @Test
    void example4() {
        String firstWord = "j";
        String secondWord = "j";
        String targetWord = "bi";
        assertTrue(test.isSumEqual(firstWord, secondWord, targetWord));
    }
}