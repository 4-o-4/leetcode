package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindCommonCharactersTest {
    private final FindCommonCharacters solution = new FindCommonCharacters();

    @Test
    void example1() {
        String[] words = {"bella", "label", "roller"};
        assertEquals(List.of("e", "l", "l"), solution.commonChars(words));
    }

    @Test
    void example2() {
        String[] words = {"cool", "lock", "cook"};
        assertEquals(List.of("c", "o"), solution.commonChars(words));
    }

    @Test
    void example3() {
        String[] words = {"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"};
        assertEquals(List.of(), solution.commonChars(words));
    }

    @Test
    void example4() {
        String[] words = {"bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba", "cbddaccc", "accdcdbb"};
        assertEquals(List.of("b", "d"), solution.commonChars(words));
    }
}