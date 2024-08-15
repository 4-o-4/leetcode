package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteColumnsToMakeSortedTest {
    private final DeleteColumnsToMakeSorted test = new DeleteColumnsToMakeSorted();

    @Test
    void example1() {
        String[] strs = {"cba", "daf", "ghi"};
        assertEquals(1, test.minDeletionSize(strs));
    }

    @Test
    void example2() {
        String[] strs = {"a", "b"};
        assertEquals(0, test.minDeletionSize(strs));
    }

    @Test
    void example3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        assertEquals(3, test.minDeletionSize(strs));
    }
}