package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RepeatedSubstringPatternTest {
    private final RepeatedSubstringPattern solution = new RepeatedSubstringPattern();

    @Test
    void example1() {
        String s = "abab";
        assertTrue(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example2() {
        String s = "aba";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example3() {
        String s = "abcabcabcabc";
        assertTrue(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example4() {
        String s = "ababab";
        assertTrue(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example5() {
        String s = "ababba";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example6() {
        String s = "abac";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example7() {
        String s = "abacababacab";
        assertTrue(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example8() {
        String s = "ababababababaababababababaababababababa";
        assertTrue(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example9() {
        String s = "ababac";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example10() {
        String s = "babbbbaabbababbaaaaababbaaabbbbaaabbbababbbbabaabababaabaaabbbabababbbabababaababaaaaabbabaaaabaaaab";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example11() {
        String s = "abaabaa";
        assertFalse(solution.repeatedSubstringPattern(s));
    }

    @Test
    void example12() {
        String s = "babbabbabbabbab";
        assertTrue(solution.repeatedSubstringPattern(s));
    }
}