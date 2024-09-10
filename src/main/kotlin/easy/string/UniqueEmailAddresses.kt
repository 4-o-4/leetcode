package easy.string

fun numUniqueEmails(emails: Array<String>): Int {
    fun getEmail(email: String): String {
        val indexOf = email.indexOf('@')
        val sb = StringBuilder()

        for ((i, c) in email.withIndex()) {
            if (c == '+' || i == indexOf)
                break
            else if (c != '.')
                sb.append(c)
        }
        return sb.append(email.substring(indexOf)).toString()
    }

    val set = mutableSetOf<String>()

    for (email in emails)
        set.add(getEmail(email))
    return set.size
}
