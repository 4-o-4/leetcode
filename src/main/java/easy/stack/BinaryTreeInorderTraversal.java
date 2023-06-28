package easy.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return list;

        stack.push(root);
        while (stack.size() != 0) {
            TreeNode node = stack.peek();
            TreeNode left = node.left;
            if (left != null) {
                stack.push(left);
                node.left = null;
                continue;
            }
            list.add(node.val);
            TreeNode right = node.right;
            if (right != null) {
                stack.pop();
                stack.push(right);
                node.right = null;
                continue;
            }
            stack.pop();
        }
        return list;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
