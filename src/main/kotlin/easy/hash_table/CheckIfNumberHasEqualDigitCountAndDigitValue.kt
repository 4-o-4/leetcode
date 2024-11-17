package easy.hash_table

fun digitCount(num: String): Boolean {
    val arr = IntArray(10)

    for (c in num)
        arr[c.digitToInt()]++
    for (i in num.indices)
        if (num[i].digitToInt() != arr[i])
            return false
    return true
}
