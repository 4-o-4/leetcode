package easy.hash_table

fun intersection(nums: Array<IntArray>): List<Int> {
    val map = mutableMapOf<Int, Int>()

    for (num in nums)
        num.forEach { map.compute(it) { _, v -> v?.inc() ?: 1 } }
    return map.filterValues { v -> v == nums.size }.keys.toSortedSet().toList()
}
