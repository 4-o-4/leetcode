package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthDistinctStringInAnArrayTest {
    private final KthDistinctStringInAnArray test = new KthDistinctStringInAnArray();

    @Test
    void example1() {
        String[] arr = {"d", "b", "c", "b", "c", "a"};
        int k = 2;
        assertEquals("a", test.kthDistinct(arr, k));
    }

    @Test
    void example2() {
        String[] arr = {"aaa", "aa", "a"};
        int k = 1;
        assertEquals("aaa", test.kthDistinct(arr, k));
    }

    @Test
    void example3() {
        String[] arr = {"a", "b", "a"};
        int k = 3;
        assertEquals("", test.kthDistinct(arr, k));
    }
}