package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private final FizzBuzz test = new FizzBuzz();

    @Test
    void example1() {
        int n = 3;
        assertEquals(List.of("1", "2", "Fizz"), test.fizzBuzz(n));
    }

    @Test
    void example2() {
        int n = 5;
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), test.fizzBuzz(n));
    }

    @Test
    void example3() {
        int n = 15;
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), test.fizzBuzz(n));
    }
}