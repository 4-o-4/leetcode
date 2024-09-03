package easy.string

import java.util.Stack

fun minLength(s: String): Int {
    val stack = Stack<Char>()
    var ch = '0'

    for (c in s) {
        if (ch == 'A' && c == 'B' || ch == 'C' && c == 'D') {
            stack.pop()
            ch = if (stack.isEmpty()) '0' else stack.peek()
            continue
        } else
            ch = c
        stack.add(c)
    }
    return stack.size
}
