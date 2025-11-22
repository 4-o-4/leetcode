from typing import List


def twoSum(nums: List[int], target: int) -> List[int]:
    l = len(nums)
    i = 1
    j = 0
    while i < l:
        if nums[j] + nums[i] == target:
            return [j, i]
        if i == l - 1:
            j += 1
            i = j + 1
        else:
            i += 1
    return []
