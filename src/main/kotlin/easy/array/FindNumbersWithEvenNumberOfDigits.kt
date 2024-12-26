package easy.array

fun findNumbers(nums: IntArray): Int {
    var counter = 0

    for (n in nums)
        if (n.toString().length % 2 == 0)
            counter++
    return counter
}
