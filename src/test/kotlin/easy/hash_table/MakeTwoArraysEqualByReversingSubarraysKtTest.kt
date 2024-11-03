package easy.hash_table

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MakeTwoArraysEqualByReversingSubarraysKtTest {
    @Test
    fun example1() {
        val target = intArrayOf(1, 2, 3, 4)
        val arr = intArrayOf(2, 4, 1, 3)
        assertTrue(canBeEqual(target, arr))
    }

    @Test
    fun example2() {
        val target = intArrayOf(7)
        val arr = intArrayOf(7)
        assertTrue(canBeEqual(target, arr))
    }

    @Test
    fun example3() {
        val target = intArrayOf(3, 7, 9)
        val arr = intArrayOf(3, 7, 11)
        assertFalse(canBeEqual(target, arr))
    }
}