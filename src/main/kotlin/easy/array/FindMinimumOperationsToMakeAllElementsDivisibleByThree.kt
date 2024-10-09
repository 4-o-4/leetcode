package easy.array

fun minimumOperations(nums: IntArray): Int {
    var counter = 0

    for (num in nums)
        if (num % 3 != 0)
            counter++
    return counter
}
