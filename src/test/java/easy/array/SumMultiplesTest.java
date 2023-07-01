package easy.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMultiplesTest {
    private SumMultiples sumMultiples;

    @BeforeEach
    void init() {
        this.sumMultiples = new SumMultiples();
    }

    @Test
    void sumOfMultiplesExample1() {
        int n = 7;
        assertEquals(21, sumMultiples.sumOfMultiples(n));
    }

    @Test
    void sumOfMultiplesExample2() {
        int n = 10;
        assertEquals(40, sumMultiples.sumOfMultiples(n));
    }

    @Test
    void sumOfMultiplesExample3() {
        int n = 9;
        assertEquals(30, sumMultiples.sumOfMultiples(n));
    }

    @Test
    void sumOfMultiplesExample4() {
        int n = 15;
        assertEquals(81, sumMultiples.sumOfMultiples(n));
    }

    @Test
    void sumOfMultiplesExample5() {
        int n = 16;
        assertEquals(81, sumMultiples.sumOfMultiples(n));
    }
}