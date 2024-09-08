package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeTheStringGreatKtTest {
    @Test
    fun example1() {
        val s = "leEeetcode"
        assertEquals("leetcode", makeGood(s))
    }

    @Test
    fun example2() {
        val s = "abBAcC"
        assertEquals("", makeGood(s))
    }
}