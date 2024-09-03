package easy.string

fun checkString(s: String): Boolean {
    var j = s.length - 1
    var ib = false
    var jb = false

    for (i in s.indices) {
        if (i == s.length / 2)
            break
        if (s[i] == 'b')
            ib = true
        if (s[j] == 'a')
            jb = true
        if (ib && jb || jb && s[j] == 'b')
            return false
        j--
    }
    return true
}
