package easy.string

class ClearDigits {
    fun clearDigits(s: String): String {
        val builder = StringBuilder()
        var isDigit = 0

        for (i in s.length - 1 downTo 0) {
            if (s[i].isDigit())
                isDigit++
            else if (isDigit != 0)
                isDigit--
            else
                builder.append(s[i])
        }
        return builder.reverse().toString()
    }
}
