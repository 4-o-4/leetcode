package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PercentageOfLetterInStringTest {
    private final PercentageOfLetterInString solution = new PercentageOfLetterInString();

    @Test
    void example1() {
        String s = "foobar";
        char letter = 'o';
        assertEquals(33, solution.percentageLetter(s, letter));
    }

    @Test
    void example2() {
        String s = "jjjj";
        char letter = 'k';
        assertEquals(0, solution.percentageLetter(s, letter));
    }

    @Test
    void example3() {
        String s = "vmvvvvvzrvvpvdvvvvyfvdvvvvpkvvbvvkvvfkvvvkvbvvnvvomvzvvvdvvvkvvvvvvvvvlvcvilaqvvhoevvlmvhvkvtgwfvvzy";
        char letter = 'v';
        assertEquals(59, solution.percentageLetter(s, letter));
    }

    @Test
    void example4() {
        String s = "sgawtb";
        char letter = 's';
        assertEquals(16, solution.percentageLetter(s, letter));
    }
}