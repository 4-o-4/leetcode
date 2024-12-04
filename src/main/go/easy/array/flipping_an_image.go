package array

func flipAndInvertImage(image [][]int) [][]int {
    for _, v := range image {
        length := len(v) - 1
        for i := 0; i < len(v)/2; i++ {
            tmp := v[i]
            if v[length] == 0 {
                v[i] = 1
            } else {
                v[i] = 0
            }
            if tmp == 0 {
                v[length] = 1
            } else {
                v[length] = 0
            }
            length--
        }
    }
    return image
}
