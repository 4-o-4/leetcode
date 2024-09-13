package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReformatDateKtTest {
    @Test
    fun example1() {
        val date = "20th Oct 2052"
        assertEquals("2052-10-20", reformatDate(date))
    }

    @Test
    fun example2() {
        val date = "6th Jun 1933"
        assertEquals("1933-06-06", reformatDate(date))
    }

    @Test
    fun example3() {
        val date = "26th May 1960"
        assertEquals("1960-05-26", reformatDate(date))
    }
}