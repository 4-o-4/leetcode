package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DIStringMatchKtTest {
    @Test
    fun example1() {
        val s = "IDID"
        assertArrayEquals(intArrayOf(0, 4, 1, 3, 2), diStringMatch(s))
    }

    @Test
    fun example2() {
        val s = "III"
        assertArrayEquals(intArrayOf(0, 1, 2, 3), diStringMatch(s))
    }

    @Test
    fun example3() {
        val s = "DDI"
        assertArrayEquals(intArrayOf(3, 2, 0, 1), diStringMatch(s))
    }
}