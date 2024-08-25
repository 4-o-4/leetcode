package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringsBySeparatorTest {
    private final SplitStringsBySeparator solution = new SplitStringsBySeparator();

    @Test
    void example1() {
        List<String> words = List.of("one.two.three", "four.five", "six");
        char separator = '.';
        assertEquals(List.of("one", "two", "three", "four", "five", "six"), solution.splitWordsBySeparator(words, separator));
    }

    @Test
    void example2() {
        List<String> words = List.of("$easy$", "$problem$");
        char separator = '$';
        assertEquals(List.of("easy", "problem"), solution.splitWordsBySeparator(words, separator));
    }

    @Test
    void example3() {
        List<String> words = List.of("|||");
        char separator = '|';
        assertEquals(List.of(), solution.splitWordsBySeparator(words, separator));
    }
}