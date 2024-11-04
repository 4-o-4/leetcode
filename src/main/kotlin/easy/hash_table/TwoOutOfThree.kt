package easy.hash_table

fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
    val list = mutableSetOf<Int>()
    val set1 = nums1.toMutableSet()
    val set2 = nums2.toSet()
    val set3 = nums3.toSet()

    for (n in set1)
        if (set2.contains(n))
            list.add(n)
    set1.addAll(set2)
    for (n in set1)
        if (set3.contains(n))
            list.add(n)
    return list.toList()
}
