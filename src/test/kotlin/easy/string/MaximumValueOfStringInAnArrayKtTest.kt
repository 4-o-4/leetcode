package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumValueOfStringInAnArrayKtTest {
    @Test
    fun example1() {
        val strs = arrayOf("alic3", "bob", "3", "4", "00000")
        assertEquals(5, maximumValue(strs))
    }

    @Test
    fun example2() {
        val strs = arrayOf("1", "01", "001", "0001")
        assertEquals(1, maximumValue(strs))
    }
}