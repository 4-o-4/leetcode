package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {
    private MostCommonWord mostCommonWord;

    @BeforeEach
    void init() {
        this.mostCommonWord = new MostCommonWord();
    }

    @Test
    void mostCommonWordExample1() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        assertEquals("ball", mostCommonWord.mostCommonWord(paragraph, banned));
    }

    @Test
    void mostCommonWordExample2() {
        String paragraph = "a.";
        String[] banned = new String[]{};
        assertEquals("a", mostCommonWord.mostCommonWord(paragraph, banned));
    }
}