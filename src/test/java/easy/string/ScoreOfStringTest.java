package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreOfStringTest {
    private final ScoreOfString solution = new ScoreOfString();

    @Test
    void example1() {
        String s = "hello";
        assertEquals(13, solution.scoreOfString(s));
    }

    @Test
    void example2() {
        String s = "zaz";
        assertEquals(50, solution.scoreOfString(s));
    }
}