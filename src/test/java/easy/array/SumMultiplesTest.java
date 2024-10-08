package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumMultiplesTest {
    private final SumMultiples solution = new SumMultiples();

    @Test
    void example1() {
        int n = 7;
        assertEquals(21, solution.sumOfMultiples(n));
    }

    @Test
    void example2() {
        int n = 10;
        assertEquals(40, solution.sumOfMultiples(n));
    }

    @Test
    void example3() {
        int n = 9;
        assertEquals(30, solution.sumOfMultiples(n));
    }

    @Test
    void example4() {
        int n = 15;
        assertEquals(81, solution.sumOfMultiples(n));
    }

    @Test
    void example5() {
        int n = 16;
        assertEquals(81, solution.sumOfMultiples(n));
    }
}