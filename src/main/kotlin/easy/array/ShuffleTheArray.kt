package easy.array

fun shuffle(nums: IntArray, n: Int): IntArray {
    val arr = IntArray(nums.size)
    var j = 0

    for (i in 0 until n) {
        arr[j] = nums[i]
        arr[j + 1] = nums[i + n]
        j += 2
    }
    return arr
}
