package easy.string

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false
    val chars = Array(26) { 0 }

    for (c in s)
        chars[c - 'a']++
    for (c in t) {
        if (chars[c - 'a'] == 0)
            return false
        chars[c - 'a']--
    }
    return true
}
