package easy.hash_table

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val set1 = nums1.toSet()
    val set2 = nums2.toSet()
    return listOf(set1.filter { !set2.contains(it) }, set2.filter { !set1.contains(it) })
}
