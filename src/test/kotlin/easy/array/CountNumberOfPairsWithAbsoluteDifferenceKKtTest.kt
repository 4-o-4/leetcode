package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfPairsWithAbsoluteDifferenceKKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 2, 1)
        val k = 1
        assertEquals(4, countKDifference(nums, k))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 3)
        val k = 3
        assertEquals(0, countKDifference(nums, k))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(3, 2, 1, 5, 4)
        val k = 2
        assertEquals(3, countKDifference(nums, k))
    }
}