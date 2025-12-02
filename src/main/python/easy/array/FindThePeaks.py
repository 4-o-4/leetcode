from typing import List


def findPeaks(mountain: List[int]) -> List[int]:
    if len(mountain) == 3:
        if mountain[1] > mountain[0] and mountain[1] > mountain[2]:
            return [1]
        else:
            return []
    c = []
    for i in range(1, len(mountain) - 1):
        if mountain[i] > mountain[i - 1] and mountain[i] > mountain[i + 1]:
            c.append(i)
    return c
