package easy.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInStringTest {
    private FirstUniqueCharacterInString firstUniqueCharacterInString;

    @BeforeEach
    void init() {
        this.firstUniqueCharacterInString = new FirstUniqueCharacterInString();
    }

    @Test
    void firstUniqCharExample1() {
        String s = "leetcode";
        assertEquals(0, firstUniqueCharacterInString.firstUniqChar(s));
    }

    @Test
    void firstUniqCharExample2() {
        String s = "loveleetcode";
        assertEquals(2, firstUniqueCharacterInString.firstUniqChar(s));
    }

    @Test
    void firstUniqCharExample3() {
        String s = "aabb";
        assertEquals(-1, firstUniqueCharacterInString.firstUniqChar(s));
    }
}