package easy.array

fun maxProduct(nums: IntArray): Int {
    nums.sort()
    return (nums.last() - 1) * (nums[nums.lastIndex - 1] - 1)
}
