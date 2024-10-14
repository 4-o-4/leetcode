package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPairsWhoseSumIsLessThanTargetKtTest {
    @Test
    fun example1() {
        val nums = listOf(-1, 1, 2, 3, 1)
        val target = 2
        assertEquals(3, countPairs(nums, target))
    }

    @Test
    fun example2() {
        val nums = listOf(-6, 2, 5, -2, -7, -1, 3)
        val target = -2
        assertEquals(10, countPairs(nums, target))
    }
}