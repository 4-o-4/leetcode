package easy.array

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0

    for (arr in accounts)
        if (arr.sum() > max)
            max = arr.sum()
    return max
}
