package easy.hash_table

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NextGreaterElementIKtTest {
    @Test
    fun example1() {
        val nums1 = intArrayOf(4, 1, 2)
        val nums2 = intArrayOf(1, 3, 4, 2)
        assertArrayEquals(intArrayOf(-1, 3, -1), nextGreaterElement(nums1, nums2))
    }

    @Test
    fun example2() {
        val nums1 = intArrayOf(2, 4)
        val nums2 = intArrayOf(1, 2, 3, 4)
        assertArrayEquals(intArrayOf(3, -1), nextGreaterElement(nums1, nums2))
    }
}