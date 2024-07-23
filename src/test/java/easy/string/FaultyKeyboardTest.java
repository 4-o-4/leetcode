package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FaultyKeyboardTest {
    private final FaultyKeyboard test = new FaultyKeyboard();

    @Test
    void example1() {
        String s = "string";
        assertEquals("rtsng", test.finalString(s));
    }

    @Test
    void example2() {
        String s = "poiinter";
        assertEquals("ponter", test.finalString(s));
    }

    @Test
    void example3() {
        String s = "viwif";
        assertEquals("wvf", test.finalString(s));
    }
}