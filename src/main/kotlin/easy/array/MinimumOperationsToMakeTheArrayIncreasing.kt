package easy.array

fun minOperations(nums: IntArray): Int {
    var tmp = nums[0]
    var counter = 0

    for (i in 1..nums.lastIndex) {
        if (tmp >= nums[i]) {
            counter += tmp - nums[i] + 1
            tmp += 1
        } else
            tmp = nums[i]
    }
    return counter
}
