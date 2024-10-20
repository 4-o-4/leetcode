package easy.array

fun numberGame(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    nums.sort()

    for (i in 0 until nums.lastIndex step 2) {
        arr[i] = nums[i + 1]
        arr[i + 1] = nums[i]
    }
    return arr
}
