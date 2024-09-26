package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExcelSheetColumnNumberKtTest {
    @Test
    fun example1() {
        val columnTitle = "A"
        assertEquals(1, titleToNumber(columnTitle))
    }

    @Test
    fun example2() {
        val columnTitle = "AB"
        assertEquals(28, titleToNumber(columnTitle))
    }

    @Test
    fun example3() {
        val columnTitle = "ZY"
        assertEquals(701, titleToNumber(columnTitle))
    }

    @Test
    fun example4() {
        val columnTitle = "FXSHRXW"
        assertEquals(2147483647, titleToNumber(columnTitle))
    }

    @Test
    fun example5() {
        val columnTitle = "ABC"
        assertEquals(731, titleToNumber(columnTitle))
    }
}