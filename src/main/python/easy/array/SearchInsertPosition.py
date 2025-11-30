from typing import List


def searchInsert(nums: List[int], target: int) -> int:
    def searchIndex(nms: List[int], tgt: int) -> int:
        if len(nms) == 1:
            if nms[0] == tgt:
                return 0
            elif nms[0] > tgt:
                return 0
            else:
                return 1
        i = len(nms) // 2
        if tgt > nms[i]:
            i += searchIndex(nms[i:], tgt)
            return i
        else:
            return searchIndex(nms[:i], tgt)

    return searchIndex(nums, target)
