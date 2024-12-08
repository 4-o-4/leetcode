package easy.array

fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
    nums1.sort()
    nums2.sort()
    return nums2.first() - nums1.first()
}
