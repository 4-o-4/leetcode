package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubstringsOfSizeThreeWithDistinctCharactersKtTest {
    @Test
    fun example1() {
        val s = "xyzzaz"
        assertEquals(1, countGoodSubstrings(s))
    }

    @Test
    fun example2() {
        val s = "aababcabc"
        assertEquals(4, countGoodSubstrings(s))
    }
}