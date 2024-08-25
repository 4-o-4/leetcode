package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfTheSentenceIsPangramTest {
    private final CheckIfTheSentenceIsPangram solution = new CheckIfTheSentenceIsPangram();

    @Test
    void example1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        assertTrue(solution.checkIfPangram(sentence));
    }

    @Test
    void example2() {
        String sentence = "leetcode";
        assertFalse(solution.checkIfPangram(sentence));
    }
}