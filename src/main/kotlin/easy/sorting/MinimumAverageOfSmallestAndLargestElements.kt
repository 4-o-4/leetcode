package easy.sorting

fun minimumAverage(nums: IntArray): Double {
    var min = Double.MAX_VALUE

    nums.sort()
    var j = nums.lastIndex
    for (i in 0 until nums.size / 2) {
        val sum = (nums[i] + nums[j]) / 2.0
        if (sum < min)
            min = sum
        j--
    }
    return min
}
