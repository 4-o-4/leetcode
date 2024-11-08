package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestPositiveIntegerThatExistsWithItsNegativeKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(-1, 2, -3, 3)
        assertEquals(3, findMaxK(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(-1, 10, 6, 7, -7, 1)
        assertEquals(7, findMaxK(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(-10, 8, 6, 7, -2, -3)
        assertEquals(-1, findMaxK(nums))
    }
}