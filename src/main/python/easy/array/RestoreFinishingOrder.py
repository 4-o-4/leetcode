from typing import List


def recoverOrder(order: List[int], friends: List[int]) -> List[int]:
    l = []
    for n in order:
        if n in friends:
            l.append(n)
    return l
