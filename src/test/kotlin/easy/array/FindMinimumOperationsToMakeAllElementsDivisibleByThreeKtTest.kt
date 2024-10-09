package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertEquals(3, minimumOperations(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(3, 6, 9)
        assertEquals(0, minimumOperations(nums))
    }
}