package easy.string

fun greatestLetter(s: String): String {
    val arr = arrayOfNulls<Int>(26)

    fun isLetter(c: Char, isLowerCase: Boolean = false) {
        val i = c - if (isLowerCase) 'a' else 'A'

        if (arr[i] != null && arr[i] != 3) {
            if (arr[i] == 2 && isLowerCase)
                arr[i] = 3
            else if (arr[i] == 1 && !isLowerCase)
                arr[i] = 3
        } else if (arr[i] == null) {
            if (isLowerCase)
                arr[i] = 1
            else
                arr[i] = 2
        }
    }

    for (c in s)
        if (c.isLowerCase()) isLetter(c, true) else isLetter(c)
    for (i in arr.lastIndex downTo 0)
        if (arr[i] == 3)
            return Char(i + 65).toString()
    return ""
}
