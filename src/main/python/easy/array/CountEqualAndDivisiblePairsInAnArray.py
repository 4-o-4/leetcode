from typing import List


def countPairs(nums: List[int], k: int) -> int:
    counter = 0
    for i, v in enumerate(nums):
        for j in range(i + 1, len(nums)):
            if v == nums[j] and i * j % k == 0:
                counter += 1
    return counter
