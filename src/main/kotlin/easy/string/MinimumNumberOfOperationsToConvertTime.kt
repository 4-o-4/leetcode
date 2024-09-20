package easy.string

fun convertTime(current: String, correct: String): Int {
    val currentHH = current.substring(0, 2).toInt()
    val currentMM = current.substring(3).toInt()
    var correctHH = correct.substring(0, 2).toInt()
    var correctMM = correct.substring(3).toInt()
    var counter = 0

    if (currentMM <= correctMM)
        correctMM -= currentMM
    else {
        correctMM += 60 - currentMM
        correctHH -= 1
    }
    if (correctMM >= 15) {
        counter += correctMM / 15
        correctMM %= 15
    }
    if (correctMM >= 5) {
        counter += correctMM / 5
        correctMM %= 5
    }
    counter += correctMM
    counter += correctHH - currentHH
    return counter
}
