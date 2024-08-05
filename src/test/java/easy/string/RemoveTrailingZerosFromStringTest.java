package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveTrailingZerosFromStringTest {
    private final RemoveTrailingZerosFromString test = new RemoveTrailingZerosFromString();

    @Test
    void example1() {
        String num = "51230100";
        assertEquals("512301", test.removeTrailingZeros(num));
    }

    @Test
    void example2() {
        String num = "123";
        assertEquals("123", test.removeTrailingZeros(num));
    }
}