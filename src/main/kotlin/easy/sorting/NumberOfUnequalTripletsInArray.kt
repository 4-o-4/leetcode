package easy.sorting

fun unequalTriplets(nums: IntArray): Int {
    var counter = 0
    var tmp = nums[0]

    nums.sort()
    for (i in 1..nums.lastIndex) {
        if (tmp == nums[i])
            continue
        tmp = nums[i]
        counter++
    }
    return counter
}
