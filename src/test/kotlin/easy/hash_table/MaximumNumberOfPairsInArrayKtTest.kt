package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfPairsInArrayKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 3, 2, 1, 3, 2, 2)
        assertArrayEquals(intArrayOf(3, 1), numberOfPairs(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 1)
        assertArrayEquals(intArrayOf(1, 0), numberOfPairs(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(0)
        assertArrayEquals(intArrayOf(0, 1), numberOfPairs(nums))
    }
}