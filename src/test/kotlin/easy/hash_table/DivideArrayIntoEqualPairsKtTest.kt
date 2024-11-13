package easy.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DivideArrayIntoEqualPairsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(3, 2, 3, 2, 2, 2)
        assertTrue(divideArray(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertFalse(divideArray(nums))
    }
}