package easy.string

fun digitSum(s: String, k: Int): String {
    val sb = StringBuilder()
    var tmp = s

    while (tmp.length > k) {
        var i = 0
        var a = 0
        for (b in k..tmp.length step k) {
            tmp.substring(i, b).forEach { a += it.digitToInt() }
            sb.append(a)
            a = 0
            i = b
        }
        if (i < tmp.length) {
            tmp.substring(i).forEach { a += it.digitToInt() }
            sb.append(a)
        }
        tmp = sb.toString()
        sb.clear()
    }
    return tmp
}
