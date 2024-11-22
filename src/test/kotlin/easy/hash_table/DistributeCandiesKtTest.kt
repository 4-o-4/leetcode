package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistributeCandiesKtTest {
    @Test
    fun example1() {
        val candyType = intArrayOf(1, 1, 2, 2, 3, 3)
        assertEquals(3, distributeCandies(candyType))
    }

    @Test
    fun example2() {
        val candyType = intArrayOf(1, 1, 2, 3)
        assertEquals(2, distributeCandies(candyType))
    }

    @Test
    fun example3() {
        val candyType = intArrayOf(6, 6, 6, 6)
        assertEquals(1, distributeCandies(candyType))
    }
}