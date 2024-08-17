package easy.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SplitStringsBySeparatorTest {
    private final SplitStringsBySeparator test = new SplitStringsBySeparator();

    @Test
    void example1() {
        List<String> words = List.of("one.two.three", "four.five", "six");
        char separator = '.';
        assertEquals(List.of("one", "two", "three", "four", "five", "six"), test.splitWordsBySeparator(words, separator));
    }

    @Test
    void example2() {
        List<String> words = List.of("$easy$", "$problem$");
        char separator = '$';
        assertEquals(List.of("easy", "problem"), test.splitWordsBySeparator(words, separator));
    }

    @Test
    void example3() {
        List<String> words = List.of("|||");
        char separator = '|';
        assertEquals(List.of(), test.splitWordsBySeparator(words, separator));
    }
}