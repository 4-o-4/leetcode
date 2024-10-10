package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TheTwoSneakyNumbersOfDigitvilleKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(0, 1, 1, 0)
        assertArrayEquals(intArrayOf(1, 0), getSneakyNumbers(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0, 3, 2, 1, 3, 2)
        assertArrayEquals(intArrayOf(3, 2), getSneakyNumbers(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2)
        assertArrayEquals(intArrayOf(4, 5), getSneakyNumbers(nums))
    }
}