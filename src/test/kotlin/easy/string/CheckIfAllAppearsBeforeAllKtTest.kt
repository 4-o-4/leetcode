package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckIfAllAppearsBeforeAllKtTest {
    @Test
    fun example1() {
        val s = "aaabbb"
        assertTrue(checkString(s))
    }

    @Test
    fun example2() {
        val s = "abab"
        assertFalse(checkString(s))
    }

    @Test
    fun example3() {
        val s = "bbb"
        assertTrue(checkString(s))
    }

    @Test
    fun example4() {
        val s = "aaba"
        assertFalse(checkString(s))
    }
}