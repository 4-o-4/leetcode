package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertDateToBinaryKtTest {
    @Test
    fun example1() {
        val date = "2080-02-29"
        assertEquals("100000100000-10-11101", convertDateToBinary(date))
    }

    @Test
    fun example2() {
        val date = "1900-01-01"
        assertEquals("11101101100-1-1", convertDateToBinary(date))
    }
}