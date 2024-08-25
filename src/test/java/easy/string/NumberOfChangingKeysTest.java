package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfChangingKeysTest {
    private final NumberOfChangingKeys solution = new NumberOfChangingKeys();

    @Test
    void example1() {
        String s = "aAbBcC";
        assertEquals(2, solution.countKeyChanges(s));
    }

    @Test
    void example2() {
        String s = "AaAaAaaA";
        assertEquals(0, solution.countKeyChanges(s));
    }
}