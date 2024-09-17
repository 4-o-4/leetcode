package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReformatPhoneNumberKtTest {
    @Test
    fun example1() {
        val number = "1-23-45 6"
        assertEquals("123-456", reformatNumber(number))
    }

    @Test
    fun example2() {
        val number = "123 4-567"
        assertEquals("123-45-67", reformatNumber(number))
    }

    @Test
    fun example3() {
        val number = "123 4-5678"
        assertEquals("123-456-78", reformatNumber(number))
    }

    @Test
    fun example4() {
        val number = "1234567834545"
        assertEquals("123-456-783-45-45", reformatNumber(number))
    }
}