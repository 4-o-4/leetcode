package easy.string

fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {
    val set = mutableSetOf<String>()
    var i = 1

    for (c in 'a'..'h') {
        for (j in i..8 step 2)
            set.add("$c$j")
        i = when {
            i % 2 == 0 -> 1
            else -> 2
        }
    }
    return set.contains(coordinate1) == set.contains(coordinate2)
}
