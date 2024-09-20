package easy.string

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToConvertTimeKtTest {
    @Test
    fun example1() {
        val current = "02:30"
        val correct = "04:35"
        assertEquals(3, convertTime(current, correct))
    }

    @Test
    fun example2() {
        val current = "11:00"
        val correct = "11:01"
        assertEquals(1, convertTime(current, correct))
    }

    @Test
    fun example3() {
        val current = "10:51"
        val correct = "11:06"
        assertEquals(1, convertTime(current, correct))
    }
}