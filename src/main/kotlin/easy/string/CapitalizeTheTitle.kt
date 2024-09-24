package easy.string

fun capitalizeTitle(title: String): String {
    val split = title.split(" ")
    val list = mutableListOf<String>()

    for (word in split) {
        val w = word.lowercase()
        if (word.length <= 2)
            list.add(w)
        else {
            val chars = w.toCharArray()
            chars[0] = chars[0].uppercaseChar()
            list.add(chars.joinToString(separator = ""))
        }
    }
    return list.joinToString(separator = " ")
}
