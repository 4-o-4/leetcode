package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeTwo2DArraysBySummingValuesKtTest {
    @Test
    fun example1() {
        val nums1 = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 5))
        val nums2 = arrayOf(intArrayOf(1, 4), intArrayOf(3, 2), intArrayOf(4, 1))
        assertArrayEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(2, 3), intArrayOf(3, 2), intArrayOf(4, 6)),
            mergeArrays(nums1, nums2)
        )
    }
}