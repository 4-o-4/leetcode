package easy.hash_table

fun repeatedNTimes(nums: IntArray): Int {
    return nums.groupBy { it }
        .filterValues { it.size == nums.size / 2 }
        .values.first().first()
}
