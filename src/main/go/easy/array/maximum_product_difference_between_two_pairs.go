package array

import "sort"

func maxProductDifference(nums []int) int {
    size := len(nums) - 1
    sort.Ints(nums)
    return nums[size]*nums[size-1] - nums[0]*nums[1]
}
