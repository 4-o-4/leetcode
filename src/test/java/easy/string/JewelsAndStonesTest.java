package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {
    private JewelsAndStones jewelsAndStones;

    @BeforeEach
    void init() {
        this.jewelsAndStones = new JewelsAndStones();
    }

    @Test
    void numJewelsInStonesExample1() {
        String jewels = "aA", stones = "aAAbbbb";
        assertEquals(3, jewelsAndStones.numJewelsInStones(jewels, stones));
    }

    @Test
    void numJewelsInStonesExample2() {
        String jewels = "z", stones = "ZZ";
        assertEquals(0, jewelsAndStones.numJewelsInStones(jewels, stones));
    }
}