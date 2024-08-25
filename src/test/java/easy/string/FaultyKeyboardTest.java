package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FaultyKeyboardTest {
    private final FaultyKeyboard solution = new FaultyKeyboard();

    @Test
    void example1() {
        String s = "string";
        assertEquals("rtsng", solution.finalString(s));
    }

    @Test
    void example2() {
        String s = "poiinter";
        assertEquals("ponter", solution.finalString(s));
    }

    @Test
    void example3() {
        String s = "viwif";
        assertEquals("wvf", solution.finalString(s));
    }
}