package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheXORofNumbersWhichAppearTwiceKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 1, 3)
        assertEquals(1, duplicateNumbersXOR(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 2, 3)
        assertEquals(0, duplicateNumbersXOR(nums))
    }

    @Test
    fun example3() {
        val nums = intArrayOf(1, 2, 2, 1)
        assertEquals(3, duplicateNumbersXOR(nums))
    }
}