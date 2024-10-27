package easy.hash_table

import java.util.TreeMap

fun frequencySort(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val treeMap = TreeMap<Int, MutableList<Int>>()
    val arr = IntArray(nums.size)
    var i = 0

    nums.forEach { map.compute(it) { _, v -> if (v == null) 1 else v + 1 } }
    map.forEach { (k, v) -> treeMap.compute(v) { _, list -> list.also { it?.add(k) } ?: mutableListOf(k) } }
    for (e in treeMap) {
        val value = e.value.sorted().reversed()
        for (n in value)
            repeat(e.key) { arr[i++] = n }
    }
    return arr
}
