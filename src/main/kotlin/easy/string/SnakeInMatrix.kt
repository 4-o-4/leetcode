package easy.string

fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
    var x = 0
    var y = 0

    for (com in commands) {
        when (com) {
            "UP" -> y--
            "DOWN" -> y++
            "RIGHT" -> x++
            "LEFT" -> x--
        }
    }
    return y * n + x
}
