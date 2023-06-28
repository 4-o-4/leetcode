package easy.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    private BinaryTreeInorderTraversal binaryTreeInorderTraversal;

    @BeforeEach
    void init() {
        this.binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
    }

    @Test
    void inorderTraversalExample1() {
        BinaryTreeInorderTraversal.TreeNode treeNode2 = new BinaryTreeInorderTraversal.TreeNode(3);
        BinaryTreeInorderTraversal.TreeNode treeNode1 = new BinaryTreeInorderTraversal.TreeNode(2, treeNode2, null);
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1, null, treeNode1);
        assertEquals(List.of(1, 3, 2), binaryTreeInorderTraversal.inorderTraversal(root));
    }

    @Test
    void inorderTraversalExample2() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1, null, null);
        assertEquals(List.of(1), binaryTreeInorderTraversal.inorderTraversal(root));
    }
}