package easy.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;

    @BeforeEach
    void init() {
        this.palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    void removeOuterParenthesesExample1() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(2, node1);
        PalindromeLinkedList.ListNode node3 = new PalindromeLinkedList.ListNode(2, node2);
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, node3);
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void removeOuterParenthesesExample2() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(0, node1);
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, node2);
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void removeOuterParenthesesExample3() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1);
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }
}