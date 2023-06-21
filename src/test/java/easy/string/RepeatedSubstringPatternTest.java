package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {
    private RepeatedSubstringPattern repeatedSubstringPattern;

    @BeforeEach
    void init() {
        this.repeatedSubstringPattern = new RepeatedSubstringPattern();
    }

    @Test
    void repeatedSubstringPatternExample1() {
        String s = "abab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample2() {
        String s = "aba";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample3() {
        String s = "abcabcabcabc";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample4() {
        String s = "ababab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample5() {
        String s = "ababba";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample6() {
        String s = "abac";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample7() {
        String s = "abacababacab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample8() {
        String s = "ababababababaababababababaababababababa";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample9() {
        String s = "ababac";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample10() {
        String s = "babbbbaabbababbaaaaababbaaabbbbaaabbbababbbbabaabababaabaaabbbabababbbabababaababaaaaabbabaaaabaaaab";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample11() {
        String s = "abaabaa";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void repeatedSubstringPatternExample12() {
        String s = "babbabbabbabbab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }
}