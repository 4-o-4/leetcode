package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumElementAfterReplacementWithDigitSumKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(10, 12, 13, 14)
        assertEquals(1, minElement(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertEquals(1, minElement(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(999, 19, 199)
        assertEquals(10, minElement(nums))
    }
}