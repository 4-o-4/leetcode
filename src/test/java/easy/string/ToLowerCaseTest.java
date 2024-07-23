package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToLowerCaseTest {
    private final ToLowerCase test = new ToLowerCase();

    @Test
    void example1() {
        String s = "Hello";
        assertEquals("hello", test.toLowerCase(s));
    }

    @Test
    void example2() {
        String s = "here";
        assertEquals("here", test.toLowerCase(s));
    }

    @Test
    void example3() {
        String s = "LOVELY";
        assertEquals("lovely", test.toLowerCase(s));
    }
}