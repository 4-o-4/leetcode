package easy.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckIfNumberHasEqualDigitCountAndDigitValueKtTest {
    @Test
    fun example1() {
        val num = "1210"
        assertTrue(digitCount(num))
    }

    @Test
    fun example2() {
        val num = "030"
        assertFalse(digitCount(num))
    }
}