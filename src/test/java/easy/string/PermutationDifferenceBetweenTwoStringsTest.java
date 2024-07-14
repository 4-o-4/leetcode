package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationDifferenceBetweenTwoStringsTest {
    private final PermutationDifferenceBetweenTwoStrings permutationDifferenceBetweenTwoStrings = new PermutationDifferenceBetweenTwoStrings();

    @Test
    void Example1() {
        String s = "abc";
        String t = "bac";
        assertEquals(2, permutationDifferenceBetweenTwoStrings.findPermutationDifference(s, t));
    }

    @Test
    void Example2() {
        String s = "abcde";
        String t = "edbac";
        assertEquals(12, permutationDifferenceBetweenTwoStrings.findPermutationDifference(s, t));
    }
}