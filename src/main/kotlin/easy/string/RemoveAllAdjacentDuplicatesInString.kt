package easy.string

import java.util.Stack

fun removeDuplicates(s: String): String {
    val stack = Stack<Char>()

    for (c in s) {
        if (stack.isEmpty())
            stack.add(c)
        else {
            if (stack.peek() == c)
                stack.pop()
            else
                stack.add(c)
        }
    }
    return stack.joinToString(separator = "")
}