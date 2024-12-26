package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindNumbersWithEvenNumberOfDigitsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(12, 345, 2, 6, 7896)
        assertEquals(2, findNumbers(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(555, 901, 482, 1771)
        assertEquals(1, findNumbers(nums))
    }
}