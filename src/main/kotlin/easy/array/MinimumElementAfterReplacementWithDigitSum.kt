package easy.array

fun minElement(nums: IntArray): Int {
    var min = Int.MAX_VALUE

    for (i in nums.indices) {
        var n = nums[i]
        var sum = 0
        while (n != 0) {
            sum += n % 10
            n /= 10
        }
        if (min > sum)
            min = sum
    }
    return min
}
