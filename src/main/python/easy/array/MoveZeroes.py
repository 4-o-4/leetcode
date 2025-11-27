from queue import Queue
from typing import List


def moveZeroes(nums: List[int]) -> None:
    tmp = Queue()
    for i in range(len(nums)):
        if nums[i] == 0:
            tmp.put(i)
        else:
            if tmp.empty():
                continue
            else:
                nums[tmp.get()] = nums[i]
                nums[i] = 0
                tmp.put(i)
