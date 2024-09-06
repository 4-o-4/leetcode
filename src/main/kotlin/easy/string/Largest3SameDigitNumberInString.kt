package easy.string

fun largestGoodInteger(num: String): String {
    var tmp = '0'
    var r = ' '
    var max = 0
    var i = 1

    for (c in num) {
        if (tmp == c) {
            i++
            if (i == 3 && c > r) {
                r = c
                max = i
            }
        } else
            i = 1
        tmp = c
    }
    return r.toString().repeat(max)
}
