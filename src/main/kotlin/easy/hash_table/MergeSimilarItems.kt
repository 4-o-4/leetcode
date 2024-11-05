package easy.hash_table

import java.util.TreeMap

fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
    val map = TreeMap<Int, Int>()
    val list = mutableListOf<List<Int>>()

    for ((i1, i2) in items1)
        map[i1] = i2
    for ((i1, i2) in items2)
        map.compute(i1) { _, v -> if (v == null) i2 else v + i2 }
    map.forEach { (k, v) -> list.add(listOf(k, v)) }
    return list
}
