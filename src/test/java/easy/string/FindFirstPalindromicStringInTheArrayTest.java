package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstPalindromicStringInTheArrayTest {
    private final FindFirstPalindromicStringInTheArray test = new FindFirstPalindromicStringInTheArray();

    @Test
    void example1() {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        assertEquals("ada", test.firstPalindrome(words));
    }

    @Test
    void example2() {
        String[] words = {"notapalindrome", "racecar"};
        assertEquals("racecar", test.firstPalindrome(words));
    }

    @Test
    void example3() {
        String[] words = {"def", "ghi"};
        assertEquals("", test.firstPalindrome(words));
    }

    @Test
    void example4() {
        String[] words = {"def", "amma"};
        assertEquals("amma", test.firstPalindrome(words));
    }
}