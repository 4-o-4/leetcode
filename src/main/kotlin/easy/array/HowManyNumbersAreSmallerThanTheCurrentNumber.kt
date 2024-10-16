package easy.array

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    val sortNums = nums.clone()
    sortNums.sort()

    for ((i, n) in nums.withIndex()) {
        for (j in sortNums.indices) {
            if (n <= sortNums[j]) {
                arr[i] = j
                break
            }
        }
    }
    return arr
}
