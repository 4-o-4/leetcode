package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteColumnsToMakeSortedTest {
    private final DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted();

    @Test
    void example1() {
        String[] strs = {"cba", "daf", "ghi"};
        assertEquals(1, solution.minDeletionSize(strs));
    }

    @Test
    void example2() {
        String[] strs = {"a", "b"};
        assertEquals(0, solution.minDeletionSize(strs));
    }

    @Test
    void example3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        assertEquals(3, solution.minDeletionSize(strs));
    }
}