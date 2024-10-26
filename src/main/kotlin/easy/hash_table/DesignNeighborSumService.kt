package easy.hash_table

class DesignNeighborSumService(grid: Array<IntArray>) {
    private val map = mutableMapOf<Int, Pair<Int, Int>>()
    private val width = grid.lastIndex
    private val tmp = grid

    init {
        for (i in grid.indices)
            for (j in grid[i].indices)
                map[grid[i][j]] = j to i
    }

    fun adjacentSum(value: Int): Int {
        var sum = 0
        val (x, y) = map[value]!!
        if (x + 1 <= width)
            sum += tmp[y][x + 1]
        if (x - 1 >= 0)
            sum += tmp[y][x - 1]
        if (y + 1 <= width)
            sum += tmp[y + 1][x]
        if (y - 1 >= 0)
            sum += tmp[y - 1][x]
        return sum
    }

    fun diagonalSum(value: Int): Int {
        var sum = 0
        val (x, y) = map[value]!!
        if (x + 1 <= width && y + 1 <= width)
            sum += tmp[y + 1][x + 1]
        if (x + 1 <= width && y - 1 >= 0)
            sum += tmp[y - 1][x + 1]
        if (x - 1 >= 0 && y + 1 <= width)
            sum += tmp[y + 1][x - 1]
        if (x - 1 >= 0 && y - 1 >= 0)
            sum += tmp[y - 1][x - 1]
        return sum
    }
}
