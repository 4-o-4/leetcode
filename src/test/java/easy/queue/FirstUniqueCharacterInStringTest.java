package easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInStringTest {
    private final FirstUniqueCharacterInString solution = new FirstUniqueCharacterInString();

    @Test
    void example1() {
        String s = "leetcode";
        assertEquals(0, solution.firstUniqChar(s));
    }

    @Test
    void example2() {
        String s = "loveleetcode";
        assertEquals(2, solution.firstUniqChar(s));
    }

    @Test
    void example3() {
        String s = "aabb";
        assertEquals(-1, solution.firstUniqChar(s));
    }
}