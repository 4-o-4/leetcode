package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CapitalizeTheTitleKtTest {
    @Test
    fun example1() {
        val title = "capiTalIze tHe titLe"
        assertEquals("Capitalize The Title", capitalizeTitle(title))
    }

    @Test
    fun example2() {
        val title = "First leTTeR of EACH Word"
        assertEquals("First Letter of Each Word", capitalizeTitle(title))
    }

    @Test
    fun example3() {
        val title = "i lOve leetcode"
        assertEquals("i Love Leetcode", capitalizeTitle(title))
    }
}