package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationDifferenceBetweenTwoStringsTest {
    private final PermutationDifferenceBetweenTwoStrings solution = new PermutationDifferenceBetweenTwoStrings();

    @Test
    void example1() {
        String s = "abc";
        String t = "bac";
        assertEquals(2, solution.findPermutationDifference(s, t));
    }

    @Test
    void example2() {
        String s = "abcde";
        String t = "edbac";
        assertEquals(12, solution.findPermutationDifference(s, t));
    }
}