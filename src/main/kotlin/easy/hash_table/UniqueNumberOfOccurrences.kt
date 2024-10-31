package easy.hash_table

fun uniqueOccurrences(arr: IntArray): Boolean {
    val values = arr.groupBy { it }.values
    val set = values.map { it.size }.toSet()
    return set.size == values.size
}
