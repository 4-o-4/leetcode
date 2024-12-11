package easy.array

fun sumOfSquares(nums: IntArray): Int {
    var sum = 0

    val n = nums.size
    for (i in nums.indices)
        if (n % (i + 1) == 0)
            sum += nums[i] * nums[i]
    return sum
}
