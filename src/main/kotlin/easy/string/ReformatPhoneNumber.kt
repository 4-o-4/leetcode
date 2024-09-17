package easy.string

import java.util.Stack

fun reformatNumber(number: String): String {
    val stack = Stack<Char>()
    val sb = StringBuilder()
    var j = number.length

    for (i in number.lastIndex downTo 0)
        if (number[i].isDigit())
            stack.add(number[i])
    if (stack.size % 3 == 1)
        j = stack.size - 4
    for ((i, c) in stack.reversed().withIndex()) {
        if (i > j) {
            if (i - j == 2 || i - j == 4)
                sb.append('-')
            sb.append(c)
        } else {
            if (i != 0 && i % 3 == 0)
                sb.append('-')
            sb.append(c)
        }
    }
    return sb.toString()
}
