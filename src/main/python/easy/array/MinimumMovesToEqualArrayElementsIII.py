from typing import List


def minMoves(nums: List[int]) -> int:
    nums.sort()
    m = nums[len(nums) - 1]
    c = 0
    for i in range(len(nums) - 1):
        c += m - nums[i]
    return c
