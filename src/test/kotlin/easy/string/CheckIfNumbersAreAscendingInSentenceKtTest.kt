package easy.string

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckIfNumbersAreAscendingInSentenceKtTest {
    @Test
    fun example1() {
        val s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        assertTrue(areNumbersAscending(s))
    }

    @Test
    fun example2() {
        val s = "hello world 5 x 5"
        assertFalse(areNumbersAscending(s))
    }

    @Test
    fun example3() {
        val s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
        assertFalse(areNumbersAscending(s))
    }
}