package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreatestEnglishLetterInUpperAndLowerCaseKtTest {
    @Test
    fun example1() {
        val s = "lEeTcOdE"
        assertEquals("E", greatestLetter(s))
    }

    @Test
    fun example2() {
        val s = "arRAzFif"
        assertEquals("R", greatestLetter(s))
    }

    @Test
    fun example3() {
        val s = "AbCdEfGhIjK"
        assertEquals("", greatestLetter(s))
    }

    @Test
    fun example4() {
        val s = "leeTcOde"
        assertEquals("", greatestLetter(s))
    }
}