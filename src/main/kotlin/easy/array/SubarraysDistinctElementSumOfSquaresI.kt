package easy.array

fun sumCounts(nums: List<Int>): Int {
    val set = mutableSetOf<Int>()
    var sum = nums.size
    var i = 2

    fun square(x: Int) = x * x

    while (i <= nums.size) {
        for (j in nums.indices) {
            if (j + i > nums.size)
                break
            for (k in 0 until i) {
                if (k == 0 && j != 0)
                    set.remove(nums[j - 1])
                set.add(nums[k + j])
            }
            sum += square(set.size)
        }
        set.clear()
        i++
    }
    return sum
}
