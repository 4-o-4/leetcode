package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalValueOfVariableAfterPerformingOperationsTest {
    private final FinalValueOfVariableAfterPerformingOperations solution = new FinalValueOfVariableAfterPerformingOperations();

    @Test
    void example1() {
        String[] operations = new String[]{"--X", "X++", "X++"};
        assertEquals(1, solution.finalValueAfterOperations(operations));
    }

    @Test
    void example2() {
        String[] operations = new String[]{"++X", "++X", "X++"};
        assertEquals(3, solution.finalValueAfterOperations(operations));
    }

    @Test
    void example3() {
        String[] operations = new String[]{"X++", "++X", "--X", "X--"};
        assertEquals(0, solution.finalValueAfterOperations(operations));
    }
}