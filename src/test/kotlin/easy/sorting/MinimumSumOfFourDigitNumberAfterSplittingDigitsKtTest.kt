package easy.sorting

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSumOfFourDigitNumberAfterSplittingDigitsKtTest {
    @Test
    fun example1() {
        val num = 2932
        assertEquals(52, minimumSum(num))
    }

    @Test
    fun example2() {
        val num = 4009
        assertEquals(13, minimumSum(num))
    }
}