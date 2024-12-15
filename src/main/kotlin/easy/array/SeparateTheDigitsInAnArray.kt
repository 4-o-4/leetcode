package easy.array

fun separateDigits(nums: IntArray): IntArray {
    val list = mutableListOf<Int>()

    for (n in nums) {
        if (n < 10)
            list.add(n)
        else
            n.separate(list)
    }
    return list.toIntArray()
}

fun Int.separate(list: MutableList<Int>) {
    val listTmp = mutableListOf<Int>()
    var tmp = this

    do {
        listTmp.add(tmp % 10)
        tmp /= 10
    } while (tmp > 0)
    list.addAll(listTmp.reversed())
}
