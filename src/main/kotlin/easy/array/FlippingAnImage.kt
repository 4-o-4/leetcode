package easy.array

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val arr = Array(image.size) { intArrayOf() }

    for ((j, img) in image.withIndex()) {
        val tmp = IntArray(img.size)
        var length = img.lastIndex
        for (i in 0..img.size / 2) {
            if (img[length] == 0)
                tmp[i] = 1
            if (img[i] == 0)
                tmp[length] = 1
            length--
        }
        arr[j] = tmp
    }
    return arr
}
