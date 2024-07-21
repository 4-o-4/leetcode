package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MostCommonWordTest {
    private final MostCommonWord test = new MostCommonWord();

    @Test
    void example1() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        assertEquals("ball", test.mostCommonWord(paragraph, banned));
    }

    @Test
    void example2() {
        String paragraph = "a.";
        String[] banned = new String[]{};
        assertEquals("a", test.mostCommonWord(paragraph, banned));
    }
}