def addBinary(a: str, b: str) -> str:
    return format(int(a, 2) + int(b, 2), 'b')


if __name__ == '__main__':
    print(addBinary(a="11", b="1"))
    print(addBinary(a="1010", b="1011"))
