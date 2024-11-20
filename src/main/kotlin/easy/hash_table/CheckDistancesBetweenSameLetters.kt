package easy.hash_table

fun checkDistances(s: String, distance: IntArray): Boolean {
    val map = mutableMapOf<Char, Int>()

    for ((i, c) in s.withIndex())
        map.compute(c) { _, v -> if (v == null) i else i - v - 1 }
    for ((k, v) in map)
        if (distance[k - 'a'] != v)
            return false
    return true
}
