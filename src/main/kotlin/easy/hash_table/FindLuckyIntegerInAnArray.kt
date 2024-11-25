package easy.hash_table

fun findLucky(arr: IntArray): Int {
    var counter = -1
    var tmp = 0

    arr.sort()
    for (i in arr.lastIndex downTo 0) {
        if (tmp != arr[i]) {
            if (counter != -1 && counter == arr[i + 1])
                return counter
            tmp = arr[i]
            counter = 1
            continue
        }
        if (tmp == arr[i])
            counter++
    }
    return if (counter == arr[0]) counter else -1
}
