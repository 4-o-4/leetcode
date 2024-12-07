package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FinalArrayStateAfterKMultiplicationOperationsIKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(2, 1, 3, 5, 6)
        val k = 5
        val multiplier = 2
        assertArrayEquals(intArrayOf(8, 4, 6, 5, 6), getFinalState(nums, k, multiplier))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 2)
        val k = 3
        val multiplier = 4
        assertArrayEquals(intArrayOf(16, 8), getFinalState(nums, k, multiplier))
    }
}