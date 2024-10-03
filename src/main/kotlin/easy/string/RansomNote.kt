package easy.string

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val arr = IntArray(26) { 0 }

    for (c in magazine)
        arr[c - 'a']++
    for (c in ransomNote)
        if (arr[c - 'a']-- <= 0)
            return false
    return true
}
