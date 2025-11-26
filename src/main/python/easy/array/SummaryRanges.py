from typing import List


def summaryRanges(nums: List[int]) -> List[str]:
    tmp = []
    if not nums:
        return tmp
    s = e = t = nums[0]
    for i in range(len(nums)):
        if t == nums[i]:
            e = t
        else:
            if e - s != 0:
                tmp.append(str(s) + "->" + str(e))
            else:
                tmp.append(str(s))
            s = e = t = nums[i]
        t += 1
    if e - s != 0:
        tmp.append(str(s) + "->" + str(e))
    else:
        tmp.append(str(nums[-1]))
    return tmp
