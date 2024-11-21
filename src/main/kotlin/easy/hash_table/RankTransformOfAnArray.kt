package easy.hash_table

fun arrayRankTransform(arr: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val array = IntArray(arr.size)
    var counter = 0

    val set = arr.toSortedSet()
    for ((i, v) in set.withIndex())
        map[v] = i + 1
    for (n in arr)
        array[counter++] = map[n]!!
    return array
}
