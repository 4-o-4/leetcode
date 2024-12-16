package easy.array

fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
    val min = mutableSetOf<Int>()
    val list = mutableListOf<Int>()

    for ((i, m) in matrix.withIndex()) {
        var minTmp = Int.MAX_VALUE
        for (n in m)
            if (n < minTmp)
                minTmp = n
        min.add(minTmp)
    }
    for (i in matrix[0].indices) {
        var maxTmp = Int.MIN_VALUE
        for (y in matrix.indices) {
            if (matrix[y][i] > maxTmp)
                maxTmp = matrix[y][i]
        }
        if (min.contains(maxTmp))
            list.add(maxTmp)
    }
    return list
}
