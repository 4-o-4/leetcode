from typing import List


def removeElement(nums: List[int], val: int) -> int:
    new_nums = [n for n in nums if n != val]
    for i in range(len(new_nums)):
        nums[i] = new_nums[i]
    for i in range(len(new_nums), len(nums)):
        nums[i] = '_'
    print(nums)
    return len(new_nums)
