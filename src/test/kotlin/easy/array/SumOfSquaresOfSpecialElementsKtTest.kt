package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfSquaresOfSpecialElementsKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertEquals(21, sumOfSquares(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(2, 7, 1, 19, 18, 3)
        assertEquals(63, sumOfSquares(nums))
    }
}