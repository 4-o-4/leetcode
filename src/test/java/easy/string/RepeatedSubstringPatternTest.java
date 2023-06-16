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
    void licenseKeyFormatting1() {
        String s = "abab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting2() {
        String s = "aba";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting3() {
        String s = "abcabcabcabc";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting4() {
        String s = "ababab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting5() {
        String s = "ababba";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting6() {
        String s = "abac";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting7() {
        String s = "abacababacab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting8() {
        String s = "ababababababaababababababaababababababa";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting9() {
        String s = "ababac";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting10() {
        String s = "babbbbaabbababbaaaaababbaaabbbbaaabbbababbbbabaabababaabaaabbbabababbbabababaababaaaaabbabaaaabaaaab";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting11() {
        String s = "abaabaa";
        assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }

    @Test
    void licenseKeyFormatting12() {
        String s = "babbabbabbabbab";
        assertTrue(repeatedSubstringPattern.repeatedSubstringPattern(s));
    }
}