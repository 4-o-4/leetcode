package easy.hash_table

fun minimumOperations(nums: IntArray): Int {
    var min = 0
    var tmp = 0

    val set = nums.toSortedSet()
    val max = set.last()
    for (n in set) {
        if (n == 0)
            continue
        if (max - tmp <= 0)
            break
        tmp += n - tmp
        min++
    }
    return min
}
