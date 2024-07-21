package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeTheMessageTest {
    private final DecodeTheMessage test = new DecodeTheMessage();

    @Test
    void example1() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        assertEquals("this is a secret", test.decodeMessage(key, message));
    }

    @Test
    void example2() {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        assertEquals("the five boxing wizards jump quickly", test.decodeMessage(key, message));
    }
}