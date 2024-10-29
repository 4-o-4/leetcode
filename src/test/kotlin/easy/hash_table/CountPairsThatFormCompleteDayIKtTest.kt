package easy.hash_table

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPairsThatFormCompleteDayIKtTest {
    @Test
    fun example1() {
        val hours = intArrayOf(12, 12, 30, 24, 24)
        assertEquals(2, countCompleteDayPairs(hours))
    }

    @Test
    fun example2() {
        val hours = intArrayOf(72, 48, 24, 3)
        assertEquals(3, countCompleteDayPairs(hours))
    }
}