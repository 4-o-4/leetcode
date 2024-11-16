package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeArrayZeroBySubtractingEqualAmountsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 5, 0, 3, 5)
        assertEquals(3, minimumOperations(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0)
        assertEquals(0, minimumOperations(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 2, 3, 3)
        assertEquals(3, minimumOperations(nums))
    }

    @Test
    fun example4() {
        val nums = intArrayOf(5, 3, 2, 1)
        assertEquals(4, minimumOperations(nums))
    }
}