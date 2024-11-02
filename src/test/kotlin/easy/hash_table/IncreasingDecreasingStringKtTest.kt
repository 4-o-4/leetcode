package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IncreasingDecreasingStringKtTest {
    @Test
    fun example1() {
        val s = "aaaabbbbcccc"
        assertEquals("abccbaabccba", sortString(s))
    }

    @Test
    fun example2() {
        val s = "rat"
        assertEquals("art", sortString(s))
    }
}