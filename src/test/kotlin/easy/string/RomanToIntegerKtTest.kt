package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanToIntegerKtTest {
    @Test
    fun example1() {
        val s = "III"
        assertEquals(3, romanToInt(s))
    }

    @Test
    fun example2() {
        val s = "LVIII"
        assertEquals(58, romanToInt(s))
    }

    @Test
    fun example3() {
        val s = "MCMXCIV"
        assertEquals(1994, romanToInt(s))
    }

    @Test
    fun example4() {
        val s = "MDCCCLXXXIV"
        assertEquals(1884, romanToInt(s))
    }
}