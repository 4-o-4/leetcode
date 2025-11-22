def findWordsContaining(words, x):
    tmp = []
    i = 0
    for word in words:
        if x in word:
            tmp.append(i)
        i += 1
    return tmp
