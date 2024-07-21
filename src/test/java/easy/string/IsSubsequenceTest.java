package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {
    private final IsSubsequence test = new IsSubsequence();

    @Test
    void example1() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(test.isSubsequence(s, t));
    }

    @Test
    void example2() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(test.isSubsequence(s, t));
    }

    @Test
    void example3() {
        String s = "bb";
        String t = "ahbgdc";
        assertFalse(test.isSubsequence(s, t));
    }

    @Test
    void example4() {
        String s = "aaaaaa";
        String t = "bbaaaa";
        assertFalse(test.isSubsequence(s, t));
    }

    @Test
    void example5() {
        String s = "ab";
        String t = "baab";
        assertTrue(test.isSubsequence(s, t));
    }
}