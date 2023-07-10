package easy.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {
    private BackspaceStringCompare backspaceStringCompare;

    @BeforeEach
    void init() {
        this.backspaceStringCompare = new BackspaceStringCompare();
    }

    @Test
    void backspaceCompareExample1() {
        String s = "ab#c", t = "ad#c";
        assertTrue(backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompareExample2() {
        String s = "ab##", t = "c#d#";
        assertTrue(backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompareExample3() {
        String s = "a#c", t = "b";
        assertFalse(backspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompareExample4() {
        String s = "a##c", t = "#a#c";
        assertTrue(backspaceStringCompare.backspaceCompare(s, t));
    }
}