package easy.array

fun countPairs(nums: List<Int>, target: Int): Int {
    var counter = 0

    for (i in nums.indices)
        for (j in i + 1..nums.lastIndex)
            if (nums[i] + nums[j] < target)
                counter++
    return counter
}
