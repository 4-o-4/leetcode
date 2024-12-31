package easy.sorting

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortArrayByParityKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(3, 1, 2, 4)
        assertArrayEquals(intArrayOf(2, 4, 3, 1), sortArrayByParity(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0)
        assertArrayEquals(intArrayOf(0), sortArrayByParity(nums))
    }
}