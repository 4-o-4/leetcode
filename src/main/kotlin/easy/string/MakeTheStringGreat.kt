package easy.string

import java.util.Stack

fun makeGood(s: String): String {
    val stack = Stack<Char>()

    for (c in s) {
        if (!stack.isEmpty() && stack.peek().lowercaseChar() == c.lowercaseChar())
            if (!stack.peek().equals(c)) {
                stack.pop()
                continue
            }
        stack.add(c)
    }
    return stack.joinToString(separator = "")
}
