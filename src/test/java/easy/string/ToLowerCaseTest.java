package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToLowerCaseTest {
    private final ToLowerCase solution = new ToLowerCase();

    @Test
    void example1() {
        String s = "Hello";
        assertEquals("hello", solution.toLowerCase(s));
    }

    @Test
    void example2() {
        String s = "here";
        assertEquals("here", solution.toLowerCase(s));
    }

    @Test
    void example3() {
        String s = "LOVELY";
        assertEquals("lovely", solution.toLowerCase(s));
    }
}