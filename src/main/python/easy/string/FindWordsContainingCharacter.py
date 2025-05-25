def findWordsContaining(words, x):
    """
    :type words: List[str]
    :type x: str
    :rtype: List[int]
    """
    tmp = []
    i = 0

    for word in words:
        if x in word:
            tmp.append(i)
        i += 1
    return tmp


if __name__ == '__main__':
    print(findWordsContaining(["leet", "code"], "e"))
    print(findWordsContaining(["abc", "bcd", "aaaa", "cbc"], "a"))
    print(findWordsContaining(["abc", "bcd", "aaaa", "cbc"], "z"))
