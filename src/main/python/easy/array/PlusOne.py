from typing import List


def plusOne(digits: List[int]) -> List[int]:
    n = digits[len(digits) - 1]
    if n != 9:
        digits[len(digits) - 1] = n + 1
        return digits
    else:
        s = ""
        for d in digits:
            s += str(d)
        s = int(s) + 1
        return [int(c) for c in str(s)]
