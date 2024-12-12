package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HeightCheckerKtTest {
    @Test
    fun example1() {
        val heights = intArrayOf(1, 1, 4, 2, 1, 3)
        assertEquals(3, heightChecker(heights))
    }

    @Test
    fun example2() {
        val heights = intArrayOf(5, 1, 2, 3, 4)
        assertEquals(5, heightChecker(heights))
    }

    @Test
    fun example3() {
        val heights = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(0, heightChecker(heights))
    }
}