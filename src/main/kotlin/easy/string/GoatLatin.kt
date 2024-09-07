package easy.string

fun toGoatLatin(sentence: String): String {
    val split = sentence.split(" ")
    val charSet = setOf('a', 'e', 'i', 'o', 'u')
    val builder = StringBuilder()
    var i = 1

    for (word in split) {
        if (charSet.contains(word.first().lowercaseChar()))
            builder.append(word)
        else {
            builder.append(word.substring(1))
            builder.append(word[0])
        }
        builder.append("ma")
        builder.append("a".repeat(i++))
        builder.append(" ")
    }
    return builder.trim().toString()
}
