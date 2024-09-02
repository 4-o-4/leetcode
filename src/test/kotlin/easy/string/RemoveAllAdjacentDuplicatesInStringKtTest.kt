package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveAllAdjacentDuplicatesInStringKtTest {
    @Test
    fun example1() {
        val s = "abbaca"
        assertEquals("ca", removeDuplicates(s))
    }

    @Test
    fun example2() {
        val s = "azxxzy"
        assertEquals("ay", removeDuplicates(s))
    }
}