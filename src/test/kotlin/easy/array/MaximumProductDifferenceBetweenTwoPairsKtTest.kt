package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductDifferenceBetweenTwoPairsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(5, 6, 2, 7, 4)
        assertEquals(34, maxProductDifference(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(4, 2, 5, 9, 7, 4, 8)
        assertEquals(64, maxProductDifference(nums))
    }
}