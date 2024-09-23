package easy.string

import kotlin.math.max

fun furthestDistanceFromOrigin(moves: String): Int {
    var cL = 0
    var cR = 0
    var c_ = 0
    var tmp_ = 0
    var max = 0

    for (c in moves) {
        when (c) {
            'L' -> {
                cL++
                if (cR != 0) {
                    max = max(max, cR + c_)
                    cR = 0
                    c_ = tmp_
                }
                tmp_ = 0
            }

            'R' -> {
                cR++
                if (cL != 0) {
                    max = max(max, cL + c_)
                    cL = 0
                    c_ = tmp_
                }
                tmp_ = 0
            }

            else -> {
                c_++
                tmp_++
            }
        }
    }
    return max(max, cL + cR + c_)
}
