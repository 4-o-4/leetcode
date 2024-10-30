package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfUniqueElementsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 2)
        assertEquals(4, sumOfUnique(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        assertEquals(0, sumOfUnique(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(15, sumOfUnique(nums))
    }
}