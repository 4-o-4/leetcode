package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JewelsAndStonesTest {
    private final JewelsAndStones test = new JewelsAndStones();

    @Test
    void example1() {
        String jewels = "aA", stones = "aAAbbbb";
        assertEquals(3, test.numJewelsInStones(jewels, stones));
    }

    @Test
    void example2() {
        String jewels = "z", stones = "ZZ";
        assertEquals(0, test.numJewelsInStones(jewels, stones));
    }
}