package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfWordsFoundInSentencesTest {
    private final MaximumNumberOfWordsFoundInSentences test = new MaximumNumberOfWordsFoundInSentences();

    @Test
    void example1() {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, test.mostWordsFound(sentences));
    }

    @Test
    void example2() {
        String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};
        assertEquals(3, test.mostWordsFound(sentences));
    }
}