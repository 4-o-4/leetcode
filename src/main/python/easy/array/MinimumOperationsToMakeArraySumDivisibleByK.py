from typing import List


def minOperations(nums: List[int], k: int) -> int:
    s = 0
    for n in nums:
        s += n
    return s % k
