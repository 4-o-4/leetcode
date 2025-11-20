from collections import deque
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def isSameTree(p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
    result_l = []
    result_r = []

    queue = deque([p])

    while any(node is not None for node in queue):
        node = queue.popleft()
        if node is None:
            result_l.append(-1)
            queue.append(None)
            queue.append(None)
        else:
            result_l.append(node.val)
            queue.append(node.left)
            queue.append(node.right)

    queue = deque([q])

    while any(node is not None for node in queue):
        node = queue.popleft()
        if node is None:
            result_r.append(-1)
            queue.append(None)
            queue.append(None)
        else:
            result_r.append(node.val)
            queue.append(node.left)
            queue.append(node.right)

    return result_l == result_r
