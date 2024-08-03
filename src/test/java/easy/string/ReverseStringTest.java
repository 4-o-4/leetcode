package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {
    private final ReverseString test = new ReverseString();

    @Test
    void example1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'o', 'l', 'l', 'e', 'h'};
        test.reverseString(s);
        assertArrayEquals(output, s);
    }

    @Test
    void example2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] output = {'h', 'a', 'n', 'n', 'a', 'H'};
        test.reverseString(s);
        assertArrayEquals(output, s);
    }
}