package easy.array

import kotlin.math.max

fun maxFrequencyElements(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var m = 0
    var c = 0

    nums.forEach { map.compute(it) { _, v -> v?.inc() ?: 1 } }
    map.values.forEach { m = max(m, it) }
    map.values.forEach { if (it == m) c++ }
    return m * c
}
