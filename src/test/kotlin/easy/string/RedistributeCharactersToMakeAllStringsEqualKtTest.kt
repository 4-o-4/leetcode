package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RedistributeCharactersToMakeAllStringsEqualKtTest {
    @Test
    fun example1() {
        val words = arrayOf("abc", "aabc", "bc")
        assertTrue(makeEqual(words))
    }

    @Test
    fun example2() {
        val words = arrayOf("ab", "a")
        assertFalse(makeEqual(words))
    }
}