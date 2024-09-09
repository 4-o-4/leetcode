package easy.string

fun uncommonFromSentences(s1: String, s2: String): Array<String> {
    val listS1 = s1.split(" ")
    val listS2 = s2.split(" ")
    val map = mutableMapOf<String, Int>()
    val list = mutableListOf<String>()

    for (w in listS1)
        map.compute(w) { _, v -> if (v == null) 1 else v + 1 }
    for (w in listS2)
        map.compute(w) { _, v -> if (v == null) 1 else v + 1 }
    for ((k, v) in map)
        if (v == 1)
            list.add(k)
    return list.toTypedArray()
}
