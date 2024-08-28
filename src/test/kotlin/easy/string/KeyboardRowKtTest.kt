package easy.string

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class KeyboardRowKtTest {
    @Test
    fun example1() {
        val words = arrayOf("Hello", "Alaska", "Dad", "Peace")
        assertArrayEquals(arrayOf("Alaska", "Dad"), findWords(words))
    }

    @Test
    fun example2() {
        val words = arrayOf("omk")
        assertArrayEquals(arrayOf(), findWords(words))
    }

    @Test
    fun example3() {
        val words = arrayOf("adsdf", "sfd")
        assertArrayEquals(arrayOf("adsdf", "sfd"), findWords(words))
    }
}