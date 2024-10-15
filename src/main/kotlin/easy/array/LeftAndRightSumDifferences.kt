package easy.array

import kotlin.math.abs

fun leftRightDifference(nums: IntArray): IntArray {
    val sum = nums.sum()
    var leftSum = 0
    var rightSum = sum - nums[0]
    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        if (i == 0) {
            answer[i] = abs(leftSum - rightSum)
            continue
        }
        leftSum += nums[i - 1]
        rightSum -= nums[i]
        answer[i] = abs(leftSum - rightSum)

    }
    return answer
}
