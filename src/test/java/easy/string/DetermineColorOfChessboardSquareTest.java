package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetermineColorOfChessboardSquareTest {
    private final DetermineColorOfChessboardSquare test = new DetermineColorOfChessboardSquare();

    @Test
    void example1() {
        String coordinates = "a1";
        assertFalse(test.squareIsWhite(coordinates));
    }

    @Test
    void example2() {
        String coordinates = "h3";
        assertTrue(test.squareIsWhite(coordinates));
    }

    @Test
    void example3() {
        String coordinates = "c7";
        assertFalse(test.squareIsWhite(coordinates));
    }
}