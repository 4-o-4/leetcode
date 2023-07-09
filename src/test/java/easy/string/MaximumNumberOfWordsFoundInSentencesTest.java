package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsFoundInSentencesTest {
    private MaximumNumberOfWordsFoundInSentences maximumNumberOfWordsFoundInSentences;

    @BeforeEach
    void init() {
        this.maximumNumberOfWordsFoundInSentences = new MaximumNumberOfWordsFoundInSentences();
    }

    @Test
    void mostWordsFoundExample1() {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences));
    }

    @Test
    void mostWordsFoundExample2() {
        String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};
        assertEquals(3, maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences));
    }
}