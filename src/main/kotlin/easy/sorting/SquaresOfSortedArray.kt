package easy.sorting

fun sortedSquares(nums: IntArray): IntArray {
    for (i in nums.indices)
        nums[i] *= nums[i]
    nums.sort()
    return nums
}
