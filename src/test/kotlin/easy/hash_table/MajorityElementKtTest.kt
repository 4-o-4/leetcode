package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(3, 2, 3)
        assertEquals(3, majorityElement(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertEquals(2, majorityElement(nums))
    }
}