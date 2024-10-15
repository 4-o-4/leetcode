package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LeftAndRightSumDifferencesKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(10, 4, 8, 3)
        assertArrayEquals(intArrayOf(15, 1, 11, 22), leftRightDifference(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1)
        assertArrayEquals(intArrayOf(0), leftRightDifference(nums))
    }
}