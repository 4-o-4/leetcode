from typing import List


def removeDuplicates(nums: List[int]) -> int:
    s = set(nums)
    ss = sorted(s)
    for i, v in enumerate(ss):
        nums[i] = v
    k = len(s)
    for i in range(k, len(nums)):
        nums[i] = 0
    return k
