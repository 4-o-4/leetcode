package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculateDigitSumOfStringKtTest {
    @Test
    fun example1() {
        val s = "11111222223"
        val k = 3
        assertEquals("135", digitSum(s, k))
    }

    @Test
    fun example2() {
        val s = "00000000"
        val k = 3
        assertEquals("000", digitSum(s, k))
    }
}