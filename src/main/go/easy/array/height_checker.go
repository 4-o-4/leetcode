package array

import "sort"

func heightChecker(heights []int) int {
    counter := 0
    dst := make([]int, len(heights))

    copy(dst, heights)
    sort.Ints(dst)
    for i, v := range heights {
        if v != dst[i] {
            counter++
        }
    }
    return counter
}
