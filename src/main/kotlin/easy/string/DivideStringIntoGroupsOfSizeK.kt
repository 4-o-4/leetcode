package easy.string

fun divideString(s: String, k: Int, fill: Char): Array<String> {
    val list = mutableListOf<String>()
    val sb = StringBuilder()
    var tmp = k - 1

    for ((i, c) in s.withIndex()) {
        sb.append(c)
        if (i == tmp) {
            list.add(sb.toString())
            sb.clear()
            tmp += k
        }
    }
    val i = s.length % k
    if (i != 0) {
        sb.append(fill.toString().repeat(k - i))
        list.add(sb.toString())
    }
    return list.toTypedArray()
}
