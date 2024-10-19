package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfValuesAtIndicesWithKSetBitsKtTest {
    @Test
    fun example1() {
        val nums = listOf(5, 10, 1, 5, 2)
        val k = 1
        assertEquals(13, sumIndicesWithKSetBits(nums, k))
    }

    @Test
    fun example2() {
        val nums = listOf(4, 3, 2, 1)
        val k = 2
        assertEquals(1, sumIndicesWithKSetBits(nums, k))
    }
}