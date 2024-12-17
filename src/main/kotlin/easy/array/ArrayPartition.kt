package easy.array

fun arrayPairSum(nums: IntArray): Int {
    var sum = 0

    nums.sort()
    for (i in 0..nums.lastIndex step 2)
        sum += nums[i]
    return sum
}
