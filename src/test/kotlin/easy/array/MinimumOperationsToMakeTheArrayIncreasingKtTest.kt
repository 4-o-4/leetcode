package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToMakeTheArrayIncreasingKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 1, 1)
        assertEquals(3, minOperations(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 5, 2, 4, 1)
        assertEquals(14, minOperations(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(8)
        assertEquals(0, minOperations(nums))
    }
}