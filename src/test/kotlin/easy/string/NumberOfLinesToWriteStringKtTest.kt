package easy.string

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfLinesToWriteStringKtTest {
    @Test
    fun example1() {
        val widths = intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        val s = "abcdefghijklmnopqrstuvwxyz"
        assertArrayEquals(intArrayOf(3, 60), numberOfLines(widths, s))
    }

    @Test
    fun example2() {
        val widths = intArrayOf(4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        val s = "bbbcccdddaaa"
        assertArrayEquals(intArrayOf(2, 4), numberOfLines(widths, s))
    }
}