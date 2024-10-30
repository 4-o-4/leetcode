package easy.hash_table

fun sumOfUnique(nums: IntArray): Int {
    var sum = 0
    var tmp = -1
    var f = true

    nums.sort()
    for (i in nums.indices) {
        if (i == 0) {
            tmp = nums[i]
            continue
        }
        if (tmp != nums[i] && f)
            sum += tmp
        else if (tmp == nums[i])
            f = false
        else
            f = true
        tmp = nums[i]
    }
    if (f)
        sum += tmp
    return sum
}
