package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClearDigitsTest {
    private val test = ClearDigits()

    @Test
    fun example1() {
        val s = "abc"
        assertEquals("abc", test.clearDigits(s))
    }

    @Test
    fun example2() {
        val s = "cb34"
        assertEquals("", test.clearDigits(s))
    }
}