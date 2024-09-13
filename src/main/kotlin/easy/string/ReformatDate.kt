package easy.string

fun reformatDate(date: String): String {
    val split = date.split(" ")
    val sb = StringBuilder()
    val month = mapOf(
        "Jan" to "01",
        "Feb" to "02",
        "Mar" to "03",
        "Apr" to "04",
        "May" to "05",
        "Jun" to "06",
        "Jul" to "07",
        "Aug" to "08",
        "Sep" to "09",
        "Oct" to "10",
        "Nov" to "11",
        "Dec" to "12"
    )

    for (i in split.lastIndex downTo 0) {
        if (i == 2)
            sb.append(split[i])
        else if (i == 1)
            sb.append(month[split[i]])
        else {
            var str = ""
            for (c in split[i]) {
                if (c.isDigit())
                    str += c
                else
                    break
            }
            if (str.length == 1)
                sb.append("0")
            sb.append(str)
            break
        }
        sb.append('-')
    }
    return sb.toString()
}
