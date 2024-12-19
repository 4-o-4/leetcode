package easy.array

fun diStringMatch(s: String): IntArray {
    val arr = IntArray(s.length + 1)
    var counter = 0
    var tmp = s[0]
    var d = s.length
    var i = 0

    fun di(c: Char) : Char {
        if (c == 'I') {
            arr[counter++] = i++
        } else {
            arr[counter++] = d--
        }
        return c
    }

    for (c in s)
        tmp = di(c)
    di(tmp)
    return arr
}
