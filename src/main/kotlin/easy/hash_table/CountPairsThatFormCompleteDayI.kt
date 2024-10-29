package easy.hash_table

fun countCompleteDayPairs(hours: IntArray): Int {
    var counter = 0

    for (i in hours.indices)
        for (j in i + 1..hours.lastIndex)
            if ((hours[i] + hours[j]) % 24 == 0)
                counter++
    return counter
}
