package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingTheSentenceTest {
    private final SortingTheSentence solution = new SortingTheSentence();

    @Test
    void example1() {
        String s = "is2 sentence4 This1 a3";
        assertEquals("This is a sentence", solution.sortSentence(s));
    }

    @Test
    void example2() {
        String s = "Myself2 Me1 I4 and3";
        assertEquals("Me Myself and I", solution.sortSentence(s));
    }
}