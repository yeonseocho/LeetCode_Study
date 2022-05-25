/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val stack = Stack<Int>()
        
        var pointer = head
        while (pointer != null) {
            stack.push(pointer.`val`)
            pointer = pointer.next
        }
        
        pointer = head
        for (index in 0 until stack.size / 2) {
            if (pointer?.`val` != stack.pop()) {
                return false
            }
            pointer = pointer?.next
        }
        return true
    }
}
