package easy.hash_table

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val arr = IntArray(nums1.size) { -1 }
    val length = nums2.lastIndex

    for (i in nums2.indices)
        map[nums2[i]] = i
    for (i in nums1.indices) {
        val v = map[nums1[i]]
        for (j in v!! + 1..length) {
            if (nums2[j] > nums1[i]) {
                arr[i] = nums2[j]
                break
            }
        }
    }
    return arr
}
