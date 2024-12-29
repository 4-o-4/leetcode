package easy.sorting

fun minimumSum(num: Int): Int {
    val list = mutableListOf<Int>()
    var tmp = num
    var sum = 0

    do {
        list.add(tmp % 10)
        tmp /= 10
    } while (tmp > 0)
    list.sort()
    sum += if (list[0] != 0)
        list[0] * 10 + list[2]
    else
        list[2]
    sum += if (list[1] != 0)
        list[1] * 10 + list[3]
    else
        list[3]
    return sum
}
