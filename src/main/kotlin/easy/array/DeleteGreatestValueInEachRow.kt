package easy.array

fun deleteGreatestValue(grid: Array<IntArray>): Int {
    var sum = 0

    for (n in grid)
        n.sort()
    val size = grid.size
    for (m in grid[0].indices) {
        var tmp = 0
        for (i in 0 until size) {
            val g = grid[i][m]
            if (g > tmp)
                tmp = g
        }
        sum += tmp
    }
    return sum
}
