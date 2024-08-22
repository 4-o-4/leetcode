package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfWordsYouCanTypeTest {
    private final MaximumNumberOfWordsYouCanType test = new MaximumNumberOfWordsYouCanType();

    @Test
    void example1() {
        String text = "hello world";
        String brokenLetters = "ad";
        assertEquals(1, test.canBeTypedWords(text, brokenLetters));
    }

    @Test
    void example2() {
        String text = "leet code";
        String brokenLetters = "lt";
        assertEquals(1, test.canBeTypedWords(text, brokenLetters));
    }

    @Test
    void example3() {
        String text = "leet code";
        String brokenLetters = "e";
        assertEquals(0, test.canBeTypedWords(text, brokenLetters));
    }
}