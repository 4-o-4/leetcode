package easy.string

fun findOcurrences(text: String, first: String, second: String): Array<String> {
    val arr = mutableListOf<String>()
    val list = text.split(" ")
    var tmp = ""

    for (i in list.lastIndex downTo 0) {
        if (i == list.lastIndex) {
            tmp = list[i]
            continue
        }
        if (list[i] == second)
            if (i - 1 >= 0 && list[i - 1] == first)
                arr.add(tmp)
        tmp = list[i]
    }
    arr.reverse()
    return arr.toTypedArray()
}
