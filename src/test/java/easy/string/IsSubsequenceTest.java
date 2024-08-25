package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {
    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void example1() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(solution.isSubsequence(s, t));
    }

    @Test
    void example2() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(solution.isSubsequence(s, t));
    }

    @Test
    void example3() {
        String s = "bb";
        String t = "ahbgdc";
        assertFalse(solution.isSubsequence(s, t));
    }

    @Test
    void example4() {
        String s = "aaaaaa";
        String t = "bbaaaa";
        assertFalse(solution.isSubsequence(s, t));
    }

    @Test
    void example5() {
        String s = "ab";
        String t = "baab";
        assertTrue(solution.isSubsequence(s, t));
    }
}