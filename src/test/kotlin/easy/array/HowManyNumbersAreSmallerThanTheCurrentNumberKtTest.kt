package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class HowManyNumbersAreSmallerThanTheCurrentNumberKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(8, 1, 2, 2, 3)
        assertArrayEquals(intArrayOf(4, 0, 1, 1, 3), smallerNumbersThanCurrent(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(6, 5, 4, 8)
        assertArrayEquals(intArrayOf(2, 1, 0, 3), smallerNumbersThanCurrent(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(7, 7, 7, 7)
        assertArrayEquals(intArrayOf(0, 0, 0, 0), smallerNumbersThanCurrent(nums))
    }
}