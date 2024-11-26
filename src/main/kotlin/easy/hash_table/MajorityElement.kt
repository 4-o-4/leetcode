package easy.hash_table

fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()

    val n = nums.size / 2
    nums.forEach { map.compute(it) { _, v -> v?.inc() ?: 1 } }
    for ((k, v) in map)
        if (v > n)
            return k
    return 0
}
