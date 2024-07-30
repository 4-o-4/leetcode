package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfChangingKeysTest {
    private final NumberOfChangingKeys test = new NumberOfChangingKeys();

    @Test
    void example1() {
        String s = "aAbBcC";
        assertEquals(2, test.countKeyChanges(s));
    }

    @Test
    void example2() {
        String s = "AaAaAaaA";
        assertEquals(0, test.countKeyChanges(s));
    }
}