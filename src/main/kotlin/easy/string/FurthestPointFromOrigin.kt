package easy.string

import kotlin.math.abs

fun furthestDistanceFromOrigin(moves: String): Int {
    var counter = 0
    var c_ = 0

    for (c in moves) {
        when (c) {
            'L' -> counter++
            'R' -> counter--
            else -> c_++
        }
    }
    return abs(counter) + c_
}
