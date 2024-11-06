package easy.hash_table

fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
    val list = IntArray(2)
    var n = grid[0].size
    n *= n

    val arr = IntArray(n)
    for (i in grid.indices)
        for (j in grid[i].indices)
            arr[grid[i][j] - 1]++
    for (i in arr.indices) {
        if (arr[i] == 2)
            list[0] = i + 1
        else if (arr[i] == 0)
            list[1] = i + 1
    }
    return list
}
