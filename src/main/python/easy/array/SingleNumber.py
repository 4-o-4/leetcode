from typing import List


def singleNumber(nums: List[int]) -> int:
    if len(nums) == 1:
        return nums[0]
    nums.sort()
    n1 = nums[0]
    n2 = nums[1]
    for i in range(2, len(nums)):
        if n1 != n2 and n2 == nums[i]:
            if i == 2 or n1 != nums[i - 3]:
                return n1
        n1 = n2
        n2 = nums[i]
    return nums[-1]
