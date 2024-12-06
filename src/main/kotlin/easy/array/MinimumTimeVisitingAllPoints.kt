package easy.array

import java.lang.Integer.min
import kotlin.math.abs

fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var tmpX = 0
    var tmpY = 0
    var min = -1

    fun getPoint(p: Int, tmp: Int): Int {
        return if (p < 0) {
            if (tmp < 0) {
                abs(p - tmp)
            } else {
                p * -1 + tmp
            }
        } else {
            if (tmp < 0) {
                tmp * -1 + p
            } else {
                abs(p - tmp)
            }
        }
    }

    for (point in points) {
        val (x, y) = point
        if (min == -1) {
            min = 0
        } else {
            val xx = getPoint(x, tmpX)
            val yy = getPoint(y, tmpY)
            min += abs(xx - yy)
            min += min(xx, yy)
        }
        tmpX = x
        tmpY = y
    }
    return min
}
