package easy.array

fun findGCD(nums: IntArray): Int {
    nums.sort()
    val i = nums[0]
    val j = nums[nums.lastIndex]
    var tmp = i
    while (true) {
        if (i % tmp == 0 && j % tmp == 0)
            return tmp
        tmp--
    }
}
