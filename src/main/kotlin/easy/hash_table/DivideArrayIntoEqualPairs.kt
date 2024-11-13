package easy.hash_table

fun divideArray(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()

    nums.forEach { map.compute(it) { _, v -> if (v == null) 1 else v + 1 } }
    for ((_, v) in map)
        if (v % 2 != 0)
            return false
    return true
}
