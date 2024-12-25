package easy.array

import java.util.Stack

fun calPoints(operations: Array<String>): Int {
    val stack = Stack<Int>()
    var sum = 0

    for (o in operations) {
        when (o) {
            "+" -> {
                val i1 = stack[stack.lastIndex]
                val i2 = stack[stack.lastIndex - 1]
                stack.add(i1 + i2)
            }

            "D" -> stack.add(stack.peek() * 2)
            "C" -> stack.pop()
            else -> stack.add(Integer.parseInt(o))
        }
    }
    stack.forEach { sum += it }
    return sum
}
