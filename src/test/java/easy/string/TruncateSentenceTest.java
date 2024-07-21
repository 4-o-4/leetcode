package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruncateSentenceTest {
    private final TruncateSentence test = new TruncateSentence();

    @Test
    void example1() {
        String s = "Hello how are you Contestant";
        int k = 4;
        assertEquals("Hello how are you", test.truncateSentence(s, k));
    }

    @Test
    void example2() {
        String s = "What is the solution to this problem";
        int k = 4;
        assertEquals("What is the solution", test.truncateSentence(s, k));
    }

    @Test
    void example3() {
        String s = "chopper is not a tanuki";
        int k = 5;
        assertEquals("chopper is not a tanuki", test.truncateSentence(s, k));
    }
}