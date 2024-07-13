package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfStringTest {
    private final ScoreOfString scoreOfString = new ScoreOfString();

    @Test
    void Example1() {
        String s = "hello";
        assertEquals(13, scoreOfString.scoreOfString(s));
    }

    @Test
    void Example2() {
        String s = "zaz";
        assertEquals(50, scoreOfString.scoreOfString(s));
    }
}