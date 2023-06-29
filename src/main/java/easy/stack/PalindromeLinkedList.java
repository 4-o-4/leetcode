package easy.stack;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;
        Stack<Integer> stack = new Stack<>();
        ListNode tmp = head;
        int size = 0;

        while (head != null) {
            stack.push(head.val);
            head = head.next;
            size++;
        }
        size = size / 2;
        while (size != 0) {
            if (tmp.val == stack.peek())
                stack.pop();
            else
                return false;
            tmp = tmp.next;
            size--;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
