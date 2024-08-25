package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthDistinctStringInAnArrayTest {
    private final KthDistinctStringInAnArray solution = new KthDistinctStringInAnArray();

    @Test
    void example1() {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        assertEquals("a", solution.kthDistinct(arr, k));
    }

    @Test
    void example2() {
        String[] arr = {"aaa", "aa", "a"};
        int k = 1;
        assertEquals("aaa", solution.kthDistinct(arr, k));
    }

    @Test
    void example3() {
        String[] arr = {"a", "b", "a"};
        int k = 3;
        assertEquals("", solution.kthDistinct(arr, k));
    }
}