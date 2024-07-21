package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellsInRangeOnAnExcelSheetTest {
    private final CellsInRangeOnAnExcelSheet test = new CellsInRangeOnAnExcelSheet();

    @Test
    void example1() {
        String s = "K1:L2";
        assertEquals(List.of("K1", "K2", "L1", "L2"), test.cellsInRange(s));
    }

    @Test
    void example2() {
        String s = "A1:F1";
        assertEquals(List.of("A1", "B1", "C1", "D1", "E1", "F1"), test.cellsInRange(s));
    }
}