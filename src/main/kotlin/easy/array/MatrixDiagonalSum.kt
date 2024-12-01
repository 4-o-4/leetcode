package easy.array

fun diagonalSum(mat: Array<IntArray>): Int {
    var sum = 0

    val size = mat.size
    for (i in mat.indices) {
        for (j in mat[i].indices) {
            when {
                i == j || j == size - 1 - i -> sum += mat[i][j]
            }
        }
    }
    return sum
}
