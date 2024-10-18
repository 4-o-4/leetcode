package easy.array

fun numberOfPairs(nums1: IntArray, nums2: IntArray, k: Int): Int {
    var counter = 0

    for (n2 in nums2) {
        val i = n2 * k
        for (n1 in nums1)
            if (n1 / i != 0 && n1 % i == 0)
                counter++
    }
    return counter
}
