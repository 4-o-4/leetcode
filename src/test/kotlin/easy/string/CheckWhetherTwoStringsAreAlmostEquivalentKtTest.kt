package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckWhetherTwoStringsAreAlmostEquivalentKtTest {
    @Test
    fun example1() {
        val word1 = "aaaa"
        val word2 = "bccb"
        assertFalse(checkAlmostEquivalent(word1, word2))
    }

    @Test
    fun example2() {
        val word1 = "abcdeef"
        val word2 = "abaaacc"
        assertTrue(checkAlmostEquivalent(word1, word2))
    }

    @Test
    fun example3() {
        val word1 = "cccddabba"
        val word2 = "babababab"
        assertTrue(checkAlmostEquivalent(word1, word2))
    }
}