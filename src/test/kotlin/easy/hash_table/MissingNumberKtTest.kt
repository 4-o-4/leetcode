package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MissingNumberKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(3, 0, 1)
        assertEquals(2, missingNumber(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0, 1)
        assertEquals(2, missingNumber(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
        assertEquals(8, missingNumber(nums))
    }
}