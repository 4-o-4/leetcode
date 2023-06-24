package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void init() {
        this.longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefixExample1() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample2() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample3() {
        String[] strs = new String[]{""};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample4() {
        String[] strs = new String[]{"a"};
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample5() {
        String[] strs = new String[]{"cir", "car"};
        assertEquals("c", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample6() {
        String[] strs = new String[]{"reflower", "flow", "flight"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample7() {
        String[] strs = new String[]{"ab", "a"};
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample8() {
        String[] strs = new String[]{"a", "a", "b"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample9() {
        String[] strs = new String[]{"", ""};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample10() {
        String[] strs = new String[]{"c", "c"};
        assertEquals("c", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample11() {
        String[] strs = new String[]{"aaa", "aa", "aaa"};
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample12() {
        String[] strs = new String[]{"abab", "aba", ""};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixExample13() {
        String[] strs = new String[]{"baab", "bacb", "b", "cbc"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }
}