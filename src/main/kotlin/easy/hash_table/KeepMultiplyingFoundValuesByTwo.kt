package easy.hash_table

fun findFinalValue(nums: IntArray, original: Int): Int {
    val set = nums.toSortedSet()
    var tmp = original

    do {
        if (set.contains(tmp))
            tmp *= 2
        else
            return tmp
    } while (true)
}
