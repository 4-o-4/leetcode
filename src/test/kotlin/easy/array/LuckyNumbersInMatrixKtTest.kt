package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LuckyNumbersInMatrixKtTest {
    @Test
    fun example1() {
        val matrix = arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17))
        assertEquals(listOf(15), luckyNumbers(matrix))
    }

    @Test
    fun example2() {
        val matrix = arrayOf(intArrayOf(1, 10, 4, 2), intArrayOf(9, 3, 8, 7), intArrayOf(15, 16, 17, 12))
        assertEquals(listOf(12), luckyNumbers(matrix))
    }
}