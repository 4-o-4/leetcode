package easy.array

import kotlin.math.abs

fun countKDifference(nums: IntArray, k: Int): Int {
    var counter = 0

    for (i in 0..nums.lastIndex)
        for (j in i + 1..nums.lastIndex)
            if (abs(nums[i] - nums[j]) == k)
                counter++
    return counter
}
