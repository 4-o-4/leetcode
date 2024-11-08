package easy.hash_table

import kotlin.math.abs

fun findMaxK(nums: IntArray): Int {
    var max = -1

    val set = nums.toSortedSet()
    for (n in set) {
        if (n >= 0)
            break
        if (set.contains(abs(n))) {
            max = abs(n)
            break
        }
    }
    return max
}
