package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MatrixDiagonalSumKtTest {
    @Test
    fun example1() {
        val mat = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        assertEquals(25, diagonalSum(mat))
    }

    @Test
    fun example2() {
        val mat = arrayOf(intArrayOf(5))
        assertEquals(5, diagonalSum(mat))
    }
}