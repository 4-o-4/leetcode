package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfSpecialCharactersKtTest {
    @Test
    fun example1() {
        val word = "aaAbcBC"
        assertEquals(3, numberOfSpecialChars(word))
    }

    @Test
    fun example2() {
        val word = "abc"
        assertEquals(0, numberOfSpecialChars(word))
    }

    @Test
    fun example3() {
        val word = "abBCab"
        assertEquals(1, numberOfSpecialChars(word))
    }
}