package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfRectanglesThatCanFormTheLargestSquareKtTest {
    @Test
    fun example1() {
        val rectangles = arrayOf(intArrayOf(5, 8), intArrayOf(3, 9), intArrayOf(5, 12), intArrayOf(16, 5))
        assertEquals(3, countGoodRectangles(rectangles))
    }
}