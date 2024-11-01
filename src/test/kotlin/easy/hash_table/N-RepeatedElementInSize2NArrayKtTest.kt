package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `N-RepeatedElementInSize2NArrayKtTest` {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 3)
        assertEquals(3, repeatedNTimes(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(2, 1, 2, 5, 3, 2)
        assertEquals(2, repeatedNTimes(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)
        assertEquals(5, repeatedNTimes(nums))
    }
}