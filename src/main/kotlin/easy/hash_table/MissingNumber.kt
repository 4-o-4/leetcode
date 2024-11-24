package easy.hash_table

fun missingNumber(nums: IntArray): Int {
    var counter = 0

    nums.sort()
    for (i in 0..nums.size) {
        if (i > nums.lastIndex || nums[i] != counter)
            break
        counter++
    }
    return counter
}
