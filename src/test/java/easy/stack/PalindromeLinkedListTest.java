package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeLinkedListTest {
    private final PalindromeLinkedList test = new PalindromeLinkedList();

    @Test
    void example1() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(2, node1);
        PalindromeLinkedList.ListNode node3 = new PalindromeLinkedList.ListNode(2, node2);
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, node3);
        assertTrue(test.isPalindrome(head));
    }

    @Test
    void example2() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(0, node1);
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, node2);
        assertTrue(test.isPalindrome(head));
    }

    @Test
    void example3() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1);
        assertTrue(test.isPalindrome(head));
    }
}