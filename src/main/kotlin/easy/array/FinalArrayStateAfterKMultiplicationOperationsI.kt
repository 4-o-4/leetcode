package easy.array

import java.util.TreeMap
import java.util.TreeSet

fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
    val map = TreeMap<Int, TreeSet<Int>>()

    for (i in nums.indices)
        map.compute(nums[i]) { _, v -> v?.apply { add(i) } ?: TreeSet<Int>().apply { add(i) } }
    for (i in 0 until k) {
        val key = map.firstKey()
        val set = map[key]!!
        val value = set.first()
        if (set.size != 1)
            set.remove(value)
        else
            map.remove(key)
        val firstKey = key * multiplier
        map.compute(firstKey) { _, v -> v?.apply { add(value) } ?: TreeSet<Int>().apply { add(value) } }
    }
    for ((k, v) in map)
        for (i in v)
            nums[i] = k
    return nums
}
