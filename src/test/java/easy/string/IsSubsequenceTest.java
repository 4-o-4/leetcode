package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    private IsSubsequence isSubsequence;

    @BeforeEach
    void init() {
        this.isSubsequence = new IsSubsequence();
    }

    @Test
    void isSubsequenceExample1() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceExample2() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceExample3() {
        String s = "bb";
        String t = "ahbgdc";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceExample4() {
        String s = "aaaaaa";
        String t = "bbaaaa";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }

    @Test
    void isSubsequenceExample5() {
        String s = "ab";
        String t = "baab";
        assertTrue(isSubsequence.isSubsequence(s, t));
    }
}