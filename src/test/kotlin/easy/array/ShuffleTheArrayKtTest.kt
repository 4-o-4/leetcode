package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ShuffleTheArrayKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(2, 5, 1, 3, 4, 7)
        val n = 3
        assertArrayEquals(intArrayOf(2, 3, 5, 4, 1, 7), shuffle(nums, n))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1)
        val n = 4
        assertArrayEquals(intArrayOf(1, 4, 2, 3, 3, 2, 4, 1), shuffle(nums, n))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(1, 1, 2, 2)
        val n = 2
        assertArrayEquals(intArrayOf(1, 2, 1, 2), shuffle(nums, n))
    }
}