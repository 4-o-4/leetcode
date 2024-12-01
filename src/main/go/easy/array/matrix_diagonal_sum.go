package array

func diagonalSum(mat [][]int) int {
    sum := 0

    size := len(mat)
    for i := range size {
        for j := range size {
            switch {
            case i == j || j == size-1-i:
                sum += mat[i][j]
            }
        }
    }
    return sum
}
