package easy.hash_table

import java.util.TreeMap

fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
    val map = TreeMap<Int, Int>()
    var i = 0

    nums1.forEach { (i1, i2) -> map[i1] = i2 }
    nums2.forEach { (i1, i2) -> map.compute(i1) { _, v -> if (v == null) i2 else v + i2 } }
    val arr = Array(map.size) { IntArray(0) }
    map.forEach { (k, v) -> arr[i++] = intArrayOf(k, v) }
    return arr
}
