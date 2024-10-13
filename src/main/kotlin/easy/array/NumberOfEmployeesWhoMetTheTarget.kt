package easy.array

fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
    var counter = 0
    hours.sort()

    for (i in hours.lastIndex downTo 0) {
        if (hours[i] >= target)
            counter++
        else
            break
    }
    return counter
}
