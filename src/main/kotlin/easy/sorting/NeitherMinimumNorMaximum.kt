package easy.sorting

fun findNonMinOrMax(nums: IntArray): Int {
    if (nums.size <= 2)
        return -1
    nums.sort()
    return nums[1]
}
