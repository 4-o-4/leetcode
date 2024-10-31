package easy.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class UniqueNumberOfOccurrencesKtTest {
    @Test
    fun example1() {
        val arr = intArrayOf(1, 2, 2, 1, 1, 3)
        assertTrue(uniqueOccurrences(arr))
    }

    @Test
    fun example2() {
        val arr = intArrayOf(1, 2)
        assertFalse(uniqueOccurrences(arr))
    }

    @Test
    fun example3() {
        val arr = intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)
        assertTrue(uniqueOccurrences(arr))
    }

    @Test
    fun example4() {
        val arr = intArrayOf(3, 5, -2, -3, -6, -6)
        assertFalse(uniqueOccurrences(arr))
    }
}