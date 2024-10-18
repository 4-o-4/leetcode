package easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheNumberOfGoodPairsIKtTest {
    @Test
    fun example1() {
        val nums1 = intArrayOf(1, 3, 4)
        val nums2 = intArrayOf(1, 3, 4)
        val k = 1
        assertEquals(5, numberOfPairs(nums1, nums2, k))
    }

    @Test
    fun example2() {
        val nums1 = intArrayOf(1, 2, 4, 12)
        val nums2 = intArrayOf(2, 4)
        val k = 3
        assertEquals(2, numberOfPairs(nums1, nums2, k))
    }
}