package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfBallsInBoxKtTest {
    @Test
    fun example1() {
        val lowLimit = 1
        val highLimit = 10
        assertEquals(2, countBalls(lowLimit, highLimit))
    }

    @Test
    fun example2() {
        val lowLimit = 5
        val highLimit = 15
        assertEquals(2, countBalls(lowLimit, highLimit))
    }

    @Test
    fun example3() {
        val lowLimit = 19
        val highLimit = 28
        assertEquals(2, countBalls(lowLimit, highLimit))
    }
}