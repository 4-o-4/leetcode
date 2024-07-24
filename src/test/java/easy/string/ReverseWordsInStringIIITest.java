package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInStringIIITest {
    private final ReverseWordsInStringIII test = new ReverseWordsInStringIII();

    @Test
    void example1() {
        String s = "Let's take LeetCode contest";
        assertEquals("s'teL ekat edoCteeL tsetnoc", test.reverseWords(s));
    }

    @Test
    void example2() {
        String s = "Mr Ding";
        assertEquals("rM gniD", test.reverseWords(s));
    }
}