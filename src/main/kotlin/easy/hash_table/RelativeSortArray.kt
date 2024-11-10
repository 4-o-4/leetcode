package easy.hash_table

import java.util.TreeMap

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    val arr = IntArray(arr1.size)
    val map = TreeMap<Int, Int>()
    var tmp = mutableSetOf<Int>()
    var i = 0

    arr1.forEach { map.compute(it) { _, v -> if (v == null) 1 else v + 1 } }
    for (n in arr2) {
        tmp.add(n)
        for (j in 0 until map[n]!!)
            arr[i++] = n
    }
    for ((k, n) in map) {
        if (!tmp.contains(k))
            for (j in 0 until n)
                arr[i++] = k
    }
    return arr
}
