package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KeepMultiplyingFoundValuesByTwoKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(5, 3, 6, 1, 12)
        val original = 3
        assertEquals(24, findFinalValue(nums, original))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(2, 7, 9)
        val original = 4
        assertEquals(4, findFinalValue(nums, original))
    }
}