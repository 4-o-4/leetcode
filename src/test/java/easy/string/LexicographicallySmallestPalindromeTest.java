package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LexicographicallySmallestPalindromeTest {
    private final LexicographicallySmallestPalindrome test = new LexicographicallySmallestPalindrome();

    @Test
    void example1() {
        String s = "egcfe";
        assertEquals("efcfe", test.makeSmallestPalindrome(s));
    }

    @Test
    void example2() {
        String s = "abcd";
        assertEquals("abba", test.makeSmallestPalindrome(s));
    }

    @Test
    void example3() {
        String s = "seven";
        assertEquals("neven", test.makeSmallestPalindrome(s));
    }
}