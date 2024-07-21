package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RepeatedSubstringPatternTest {
    private final RepeatedSubstringPattern test = new RepeatedSubstringPattern();

    @Test
    void example1() {
        String s = "abab";
        assertTrue(test.repeatedSubstringPattern(s));
    }

    @Test
    void example2() {
        String s = "aba";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example3() {
        String s = "abcabcabcabc";
        assertTrue(test.repeatedSubstringPattern(s));
    }

    @Test
    void example4() {
        String s = "ababab";
        assertTrue(test.repeatedSubstringPattern(s));
    }

    @Test
    void example5() {
        String s = "ababba";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example6() {
        String s = "abac";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example7() {
        String s = "abacababacab";
        assertTrue(test.repeatedSubstringPattern(s));
    }

    @Test
    void example8() {
        String s = "ababababababaababababababaababababababa";
        assertTrue(test.repeatedSubstringPattern(s));
    }

    @Test
    void example9() {
        String s = "ababac";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example10() {
        String s = "babbbbaabbababbaaaaababbaaabbbbaaabbbababbbbabaabababaabaaabbbabababbbabababaababaaaaabbabaaaabaaaab";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example11() {
        String s = "abaabaa";
        assertFalse(test.repeatedSubstringPattern(s));
    }

    @Test
    void example12() {
        String s = "babbabbabbabbab";
        assertTrue(test.repeatedSubstringPattern(s));
    }
}