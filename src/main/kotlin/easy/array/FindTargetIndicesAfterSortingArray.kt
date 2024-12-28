package easy.array

fun targetIndices(nums: IntArray, target: Int): List<Int> {
    val list = mutableListOf<Int>()

    nums.sort()
    for ((i, n) in nums.withIndex())
        if (n == target)
            list.add(i)
    return list
}
