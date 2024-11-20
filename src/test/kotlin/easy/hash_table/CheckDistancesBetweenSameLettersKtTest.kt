package easy.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CheckDistancesBetweenSameLettersKtTest {
    @Test
    fun example1() {
        val s = "abaccb"
        val distance = intArrayOf(1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        assertTrue(checkDistances(s, distance))
    }

    @Test
    fun example2() {
        val s = "aa"
        val distance = intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        assertFalse(checkDistances(s, distance))
    }
}