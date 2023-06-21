package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfVariableAfterPerformingOperationsTest {
    private FinalValueOfVariableAfterPerformingOperations finalValueOfVariableAfterPerformingOperations;

    @BeforeEach
    void init() {
        this.finalValueOfVariableAfterPerformingOperations = new FinalValueOfVariableAfterPerformingOperations();
    }

    @Test
    void finalValueAfterOperationsExample1() {
        String[] operations = new String[]{"--X", "X++", "X++"};
        assertEquals(1, finalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations));
    }

    @Test
    void finalValueAfterOperationsExample2() {
        String[] operations = new String[]{"++X", "++X", "X++"};
        assertEquals(3, finalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations));
    }

    @Test
    void finalValueAfterOperationsExample3() {
        String[] operations = new String[]{"X++", "++X", "--X", "X--"};
        assertEquals(0, finalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(operations));
    }
}