from typing import List


def earliestTime(tasks: List[List[int]]) -> int:
    k = 200
    for m1, m2 in tasks:
        s = m1 + m2
        if s < k:
            k = s
    return k
