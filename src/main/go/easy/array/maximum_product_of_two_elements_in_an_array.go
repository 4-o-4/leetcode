package array

import "sort"

func maxProduct(nums []int) int {
    size := len(nums) - 1
    sort.Ints(nums)
    return (nums[size] - 1) * (nums[size-1] - 1)
}
