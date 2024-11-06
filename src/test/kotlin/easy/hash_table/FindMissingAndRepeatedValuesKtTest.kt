package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindMissingAndRepeatedValuesKtTest {
    @Test
    fun example1() {
        val grid = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2))
        assertArrayEquals(intArrayOf(2, 4), findMissingAndRepeatedValues(grid))
    }

    @Test
    fun example2() {
        val grid = arrayOf(intArrayOf(9, 1, 7), intArrayOf(8, 9, 2), intArrayOf(3, 4, 6))
        assertArrayEquals(intArrayOf(9, 5), findMissingAndRepeatedValues(grid))
    }
}