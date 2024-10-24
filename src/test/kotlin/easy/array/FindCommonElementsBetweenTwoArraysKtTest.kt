package easy.array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindCommonElementsBetweenTwoArraysKtTest {
    @Test
    fun example1() {
        val nums1 = intArrayOf(2, 3, 2)
        val nums2 = intArrayOf(1, 2)
        assertArrayEquals(intArrayOf(2, 1), findIntersectionValues(nums1, nums2))
    }

    @Test
    fun example2() {
        val nums1 = intArrayOf(4, 3, 2, 3, 1)
        val nums2 = intArrayOf(2, 2, 5, 2, 3, 6)
        assertArrayEquals(intArrayOf(3, 4), findIntersectionValues(nums1, nums2))
    }

    @Test
    fun example3() {
        val nums1 = intArrayOf(3, 4, 2, 3)
        val nums2 = intArrayOf(1, 5)
        assertArrayEquals(intArrayOf(0, 0), findIntersectionValues(nums1, nums2))
    }
}