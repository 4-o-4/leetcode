package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FairCandySwapKtTest {
    @Test
    fun example1() {
        val aliceSizes = intArrayOf(1, 1)
        val bobSizes = intArrayOf(2, 2)
        assertArrayEquals(intArrayOf(1, 2), fairCandySwap(aliceSizes, bobSizes))
    }

    @Test
    fun example2() {
        val aliceSizes = intArrayOf(1, 2)
        val bobSizes = intArrayOf(2, 3)
        assertArrayEquals(intArrayOf(1, 2), fairCandySwap(aliceSizes, bobSizes))
    }

    @Test
    fun example3() {
        val aliceSizes = intArrayOf(2)
        val bobSizes = intArrayOf(1, 3)
        assertArrayEquals(intArrayOf(2, 3), fairCandySwap(aliceSizes, bobSizes))
    }
}