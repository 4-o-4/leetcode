package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPrefixAndSuffixPairsKtTest {
    @Test
    fun example1() {
        val words = arrayOf("a", "aba", "ababa", "aa")
        assertEquals(4, countPrefixSuffixPairs(words))
    }

    @Test
    fun example2() {
        val words = arrayOf("pa", "papa", "ma", "mama")
        assertEquals(2, countPrefixSuffixPairs(words))
    }

    @Test
    fun example3() {
        val words = arrayOf("abab", "ab")
        assertEquals(0, countPrefixSuffixPairs(words))
    }
}