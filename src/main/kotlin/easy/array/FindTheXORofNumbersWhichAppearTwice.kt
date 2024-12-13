package easy.array

fun duplicateNumbersXOR(nums: IntArray): Int {
    val set = mutableSetOf<Int>()
    val tmp = mutableSetOf<Int>()
    var tmpInt = 0

    for (n in nums) {
        if (set.contains(n))
            tmp.add(n)
        set.add(n)
    }
    if (tmp.isEmpty())
        return tmpInt
    for ((i, v) in tmp.withIndex())
        tmpInt = if (i == 0) v else tmpInt xor v
    return tmpInt
}
