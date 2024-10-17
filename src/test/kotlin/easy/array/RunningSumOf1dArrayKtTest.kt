package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RunningSumOf1dArrayKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertArrayEquals(intArrayOf(1, 3, 6, 10), runningSum(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), runningSum(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(3, 1, 2, 10, 1)
        assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), runningSum(nums))
    }
}