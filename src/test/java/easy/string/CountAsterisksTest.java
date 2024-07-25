package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountAsterisksTest {
    private final CountAsterisks test = new CountAsterisks();

    @Test
    void example1() {
        String sentence = "l|*e*et|c**o|*de|";
        assertEquals(2, test.countAsterisks(sentence));
    }

    @Test
    void example2() {
        String sentence = "iamprogrammer";
        assertEquals(0, test.countAsterisks(sentence));
    }

    @Test
    void example3() {
        String sentence = "yo|uar|e**|b|e***au|tifu|l";
        assertEquals(5, test.countAsterisks(sentence));
    }
}