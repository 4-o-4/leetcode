package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPairsOfSimilarStringsKtTest {
    @Test
    fun example1() {
        val words = arrayOf("aba", "aabb", "abcd", "bac", "aabc")
        assertEquals(2, similarPairs(words))
    }

    @Test
    fun example2() {
        val words = arrayOf("aabb", "ab", "ba")
        assertEquals(3, similarPairs(words))
    }

    @Test
    fun example3() {
        val words = arrayOf("nba", "cba", "dba")
        assertEquals(0, similarPairs(words))
    }
}