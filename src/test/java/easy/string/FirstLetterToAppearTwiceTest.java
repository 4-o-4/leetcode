package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstLetterToAppearTwiceTest {
    private final FirstLetterToAppearTwice test = new FirstLetterToAppearTwice();

    @Test
    void example1() {
        String s = "abccbaacz";
        assertEquals('c', test.repeatedCharacter(s));
    }

    @Test
    void example2() {
        String s = "abcdd";
        assertEquals('d', test.repeatedCharacter(s));
    }
}