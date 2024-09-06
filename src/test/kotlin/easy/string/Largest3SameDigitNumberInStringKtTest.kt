package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Largest3SameDigitNumberInStringKtTest {
    @Test
    fun example1() {
        val num = "6777133339"
        assertEquals("777", largestGoodInteger(num))
    }

    @Test
    fun example2() {
        val num = "2300019"
        assertEquals("000", largestGoodInteger(num))
    }

    @Test
    fun example3() {
        val num = "42352338"
        assertEquals("", largestGoodInteger(num))
    }

    @Test
    fun example4() {
        val num = "74444"
        assertEquals("444", largestGoodInteger(num))
    }
}