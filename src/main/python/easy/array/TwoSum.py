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


if __name__ == '__main__':
    print(twoSum(nums=[2, 7, 11, 15], target=9))
    print(twoSum(nums=[3, 2, 4], target=6))
    print(twoSum(nums=[3, 3], target=6))
