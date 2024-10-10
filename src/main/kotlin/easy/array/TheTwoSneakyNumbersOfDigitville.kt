package easy.array

fun getSneakyNumbers(nums: IntArray): IntArray {
    val set = mutableSetOf<Int>()
    val ints = IntArray(2)
    var i = 0

    for (n in nums) {
        if (n in set)
            ints[i++] = n
        else
            set.add(n)
        if (i == 2)
            break
    }
    return ints
}
