package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfAllOddLengthSubarraysKtTest {
    @Test
    fun example1() {
        val arr = intArrayOf(1, 4, 2, 5, 3)
        assertEquals(58, sumOddLengthSubarrays(arr))
    }

    @Test
    fun example2() {
        val arr = intArrayOf(1, 2)
        assertEquals(3, sumOddLengthSubarrays(arr))
    }

    @Test
    fun example3() {
        val arr = intArrayOf(10, 11, 12)
        assertEquals(66, sumOddLengthSubarrays(arr))
    }
}