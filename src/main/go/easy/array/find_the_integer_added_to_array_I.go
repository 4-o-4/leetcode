package array

func addedInteger(nums1 []int, nums2 []int) int {
    var sum1 int
    var sum2 int

    for _, v := range nums1 {
        sum1 += v
    }
    for _, v := range nums2 {
        sum2 += v
    }
    return (sum2 - sum1) / len(nums1)
}
