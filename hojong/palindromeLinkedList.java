/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        boolean isPalindrome = false;
        
        int totalCountOfPalindrome = getTotalCount(head);
        boolean isEvenCount = isEvenCount(totalCountOfPalindrome);
        
        if (isEvenCount && isPalindromeOfEvenCount(head, totalCountOfPalindrome)) {
            isPalindrome = true;
        } else if (!isEvenCount && isPalindromeOfOddCount(head, totalCountOfPalindrome)) {
            isPalindrome = true;
        }
       
        return isPalindrome;
    }
    
    private int getTotalCount(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    
    private boolean isEvenCount(int count) {
        return count % 2 == 0;
    }
    
    private boolean isPalindromeOfEvenCount(ListNode head, int totalCountOfPalindrome) {
        
        Stack<Integer> stack = new Stack();
        
        for (int i=0; i<totalCountOfPalindrome; i++) {
            if (i < totalCountOfPalindrome / 2) {
                stack.push(head.val);
            } else {
                if (head.val != stack.pop()) {
                    return false;
                }
            }
            head = head.next;
        }
        
        return true;
    }
    
    private boolean isPalindromeOfOddCount(ListNode head, int totalCountOfPalindrome) {
        
        Stack<Integer> stack = new Stack();
        
        for (int i=0; i<totalCountOfPalindrome; i++) {
            if (i < totalCountOfPalindrome / 2) {
                stack.push(head.val);
            } else if (i > totalCountOfPalindrome / 2) {
                if (head.val != stack.pop()) {
                    return false;
                }
            }
            
            head = head.next;
        }
        
        return true;
    }
}
