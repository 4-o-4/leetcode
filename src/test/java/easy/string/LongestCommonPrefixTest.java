package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix test = new LongestCommonPrefix();

    @Test
    void example1() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", test.longestCommonPrefix(strs));
    }

    @Test
    void example2() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example3() {
        String[] strs = new String[]{""};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example4() {
        String[] strs = new String[]{"a"};
        assertEquals("a", test.longestCommonPrefix(strs));
    }

    @Test
    void example5() {
        String[] strs = new String[]{"cir", "car"};
        assertEquals("c", test.longestCommonPrefix(strs));
    }

    @Test
    void example6() {
        String[] strs = new String[]{"reflower", "flow", "flight"};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example7() {
        String[] strs = new String[]{"ab", "a"};
        assertEquals("a", test.longestCommonPrefix(strs));
    }

    @Test
    void example8() {
        String[] strs = new String[]{"a", "a", "b"};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example9() {
        String[] strs = new String[]{"", ""};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example10() {
        String[] strs = new String[]{"c", "c"};
        assertEquals("c", test.longestCommonPrefix(strs));
    }

    @Test
    void example11() {
        String[] strs = new String[]{"aaa", "aa", "aaa"};
        assertEquals("aa", test.longestCommonPrefix(strs));
    }

    @Test
    void example12() {
        String[] strs = new String[]{"abab", "aba", ""};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example13() {
        String[] strs = new String[]{"baab", "bacb", "b", "cbc"};
        assertEquals("", test.longestCommonPrefix(strs));
    }

    @Test
    void example14() {
        String[] strs = new String[]{"ac", "ac", "a", "a"};
        assertEquals("a", test.longestCommonPrefix(strs));
    }

    @Test
    void example15() {
        String[] strs = new String[]{"flower", "flower", "flower", "flower"};
        assertEquals("flower", test.longestCommonPrefix(strs));
    }

    @Test
    void example16() {
        String[] strs = new String[]{"aa", "ab"};
        assertEquals("a", test.longestCommonPrefix(strs));
    }

    @Test
    void example17() {
        String[] strs = new String[]{"abab", "aba", "abc"};
        assertEquals("ab", test.longestCommonPrefix(strs));
    }
}