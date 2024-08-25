package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfWordsYouCanTypeTest {
    private final MaximumNumberOfWordsYouCanType solution = new MaximumNumberOfWordsYouCanType();

    @Test
    void example1() {
        String text = "hello world";
        String brokenLetters = "ad";
        assertEquals(1, solution.canBeTypedWords(text, brokenLetters));
    }

    @Test
    void example2() {
        String text = "leet code";
        String brokenLetters = "lt";
        assertEquals(1, solution.canBeTypedWords(text, brokenLetters));
    }

    @Test
    void example3() {
        String text = "leet code";
        String brokenLetters = "e";
        assertEquals(0, solution.canBeTypedWords(text, brokenLetters));
    }
}