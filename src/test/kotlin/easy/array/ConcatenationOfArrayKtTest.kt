package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConcatenationOfArrayKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 1)
        assertArrayEquals(intArrayOf(1, 2, 1, 1, 2, 1), getConcatenation(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 3, 2, 1)
        assertArrayEquals(intArrayOf(1, 3, 2, 1, 1, 3, 2, 1), getConcatenation(nums))
    }
}