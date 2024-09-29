package easy.string

fun largestOddNumber(num: String): String {
    for ((i, c) in num.reversed().withIndex())
        if ((c - '0') % 2 != 0)
            return num.substring(0, num.length - i)
    return ""
}
