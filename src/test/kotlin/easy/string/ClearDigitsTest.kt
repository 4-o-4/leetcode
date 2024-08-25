package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClearDigitsTest {
    @Test
    fun example1() {
        val s = "abc"
        assertEquals("abc", clearDigits(s))
    }

    @Test
    fun example2() {
        val s = "cb34"
        assertEquals("", clearDigits(s))
    }
}