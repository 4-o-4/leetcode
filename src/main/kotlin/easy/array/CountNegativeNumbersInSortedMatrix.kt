package easy.array

fun countNegatives(grid: Array<IntArray>): Int {
    var counter = 0

    for (g in grid)
        for (i in g.lastIndex downTo 0)
            if (g[i] < 0)
                counter++
    return counter
}
