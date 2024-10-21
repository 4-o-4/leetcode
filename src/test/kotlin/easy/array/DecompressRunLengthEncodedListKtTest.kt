package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DecompressRunLengthEncodedListKtTest {
    @Test
    fun example1() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertArrayEquals(intArrayOf(2, 4, 4, 4), decompressRLElist(nums))
    }

    @Test
    fun example2() {
        val nums = intArrayOf(1, 1, 2, 3)
        assertArrayEquals(intArrayOf(1, 3, 3), decompressRLElist(nums))
    }
}