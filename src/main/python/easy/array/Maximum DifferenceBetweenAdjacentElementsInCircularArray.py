from typing import List


def maxAdjacentDistance(nums: List[int]) -> int:
    m = 0
    s = nums[0]
    for i in range(1, len(nums)):
        if s > nums[i]:
            n = s - nums[i]
        else:
            n = nums[i] - s
        if n > m:
            m = n
        s = nums[i]
    if nums[0] > nums[len(nums) - 1]:
        n = nums[0] - nums[len(nums) - 1]
    else:
        n = nums[len(nums) - 1] - nums[0]
    if n > m:
        m = n
    return m
