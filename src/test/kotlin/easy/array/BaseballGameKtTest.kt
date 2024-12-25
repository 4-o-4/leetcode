package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BaseballGameKtTest {
    @Test
    fun example1() {
        val ops = arrayOf("5", "2", "C", "D", "+")
        assertEquals(30, calPoints(ops))
    }

    @Test
    fun example2() {
        val ops = arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")
        assertEquals(27, calPoints(ops))
    }

    @Test
    fun example3() {
        val ops = arrayOf("1", "C")
        assertEquals(0, calPoints(ops))
    }
}