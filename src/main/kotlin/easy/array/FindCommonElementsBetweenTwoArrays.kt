package easy.array

fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
    val arr = IntArray(100)
    var n1 = 0
    var n2 = 0

    for (i in nums1)
        arr[i]++
    for (i in nums2) {
        if (arr[i] == -1)
            n2++
        else if (arr[i] != 0) {
            n1 += arr[i]
            arr[i] = -1
            n2++
        }
    }
    return intArrayOf(n1, n2)
}
