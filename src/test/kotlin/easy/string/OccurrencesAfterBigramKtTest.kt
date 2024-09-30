package easy.string

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class OccurrencesAfterBigramKtTest {
    @Test
    fun example1() {
        val text = "alice is a good girl she is a good student"
        val first = "a"
        val second = "good"
        assertArrayEquals(arrayOf("girl", "student"), findOcurrences(text, first, second))
    }

    @Test
    fun example2() {
        val text = "we will we will rock you"
        val first = "we"
        val second = "will"
        assertArrayEquals(arrayOf("we", "rock"), findOcurrences(text, first, second))
    }
}