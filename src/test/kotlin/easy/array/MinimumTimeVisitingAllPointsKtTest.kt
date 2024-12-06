package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeVisitingAllPointsKtTest {
    @Test
    fun example1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))
        assertEquals(7, minTimeToVisitAllPoints(points))
    }

    @Test
    fun example2() {
        val points = arrayOf(intArrayOf(3, 2), intArrayOf(-2, 2))
        assertEquals(5, minTimeToVisitAllPoints(points))
    }
}