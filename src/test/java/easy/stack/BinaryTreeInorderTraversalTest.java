package easy.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {
    private final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    void example1() {
        BinaryTreeInorderTraversal.TreeNode treeNode2 = new BinaryTreeInorderTraversal.TreeNode(3);
        BinaryTreeInorderTraversal.TreeNode treeNode1 = new BinaryTreeInorderTraversal.TreeNode(2, treeNode2, null);
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1, null, treeNode1);
        assertEquals(List.of(1, 3, 2), solution.inorderTraversal(root));
    }

    @Test
    void example2() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1, null, null);
        assertEquals(List.of(1), solution.inorderTraversal(root));
    }
}