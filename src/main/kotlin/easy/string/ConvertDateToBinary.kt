package easy.string

fun convertDateToBinary(date: String): String {
    return StringBuilder()
        .append(Integer.toBinaryString(date.substring(0, 4).toInt()).also { if (it[0] == '0') it.drop(1) })
        .append('-')
        .append(Integer.toBinaryString(date.substring(5, 7).toInt()).also { if (it[0] == '0') it.drop(1) })
        .append('-')
        .append(Integer.toBinaryString(date.substring(8).toInt()).also { if (it[0] == '0') it.drop(1) })
        .toString()
}
