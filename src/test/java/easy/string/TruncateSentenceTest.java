package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruncateSentenceTest {
    private final TruncateSentence truncateSentence = new TruncateSentence();

    @Test
    void Example1() {
        String s = "Hello how are you Contestant";
        int k = 4;
        assertEquals("Hello how are you", truncateSentence.truncateSentence(s, k));
    }

    @Test
    void Example2() {
        String s = "What is the solution to this problem";
        int k = 4;
        assertEquals("What is the solution", truncateSentence.truncateSentence(s, k));
    }

    @Test
    void Example3() {
        String s = "chopper is not a tanuki";
        int k = 5;
        assertEquals("chopper is not a tanuki", truncateSentence.truncateSentence(s, k));
    }
}