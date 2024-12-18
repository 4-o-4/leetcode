package easy.array

fun countTestedDevices(batteryPercentages: IntArray): Int {
    var counter = 0
    var tmp = 0

    for (n in batteryPercentages) {
        if (n - tmp > 0) {
            counter++
            tmp++
        }
    }
    return counter
}
