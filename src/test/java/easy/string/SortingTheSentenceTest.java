package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingTheSentenceTest {
    private final SortingTheSentence test = new SortingTheSentence();

    @Test
    void example1() {
        String s = "is2 sentence4 This1 a3";
        assertEquals("This is a sentence", test.sortSentence(s));
    }

    @Test
    void example2() {
        String s = "Myself2 Me1 I4 and3";
        assertEquals("Me Myself and I", test.sortSentence(s));
    }
}