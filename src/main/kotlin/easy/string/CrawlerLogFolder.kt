package easy.string

fun minOperations(logs: Array<String>): Int {
    var counter = 0

    for (log in logs) {
        when (log) {
            "../" -> counter = if (counter == 0) 0 else counter - 1
            "./" -> continue
            else -> counter++
        }
    }
    return counter
}