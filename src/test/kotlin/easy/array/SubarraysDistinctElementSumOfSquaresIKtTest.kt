package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraysDistinctElementSumOfSquaresIKtTest {
    @Test
    fun example1() {
        val nums = listOf(1, 2, 1)
        assertEquals(15, sumCounts(nums))
    }

    @Test
    fun example2() {
        val nums = listOf(1, 1)
        assertEquals(3, sumCounts(nums))
    }

    @Test
    fun example3() {
        val nums = listOf(2, 2, 5, 5)
        assertEquals(22, sumCounts(nums))
    }
}