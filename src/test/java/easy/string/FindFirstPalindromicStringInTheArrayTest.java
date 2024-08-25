package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstPalindromicStringInTheArrayTest {
    private final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();

    @Test
    void example1() {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        assertEquals("ada", solution.firstPalindrome(words));
    }

    @Test
    void example2() {
        String[] words = {"notapalindrome", "racecar"};
        assertEquals("racecar", solution.firstPalindrome(words));
    }

    @Test
    void example3() {
        String[] words = {"def", "ghi"};
        assertEquals("", solution.firstPalindrome(words));
    }

    @Test
    void example4() {
        String[] words = {"def", "amma"};
        assertEquals("amma", solution.firstPalindrome(words));
    }
}