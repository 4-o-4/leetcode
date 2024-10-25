package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheHighestAltitudeKtTest {
    @Test
    fun example1() {
        val gain = intArrayOf(-5, 1, 5, 0, -7)
        assertEquals(1, largestAltitude(gain))
    }

    @Test
    fun example2() {
        val gain = intArrayOf(-4, -3, -2, -1, 4, 3, 2)
        assertEquals(0, largestAltitude(gain))
    }
}