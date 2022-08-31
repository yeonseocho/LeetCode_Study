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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null || l2 == null) {
            return null
        }
        
        val result: ListNode = ListNode(0)
        var leftPointer: ListNode? = l1
        var rightPointer: ListNode? = l2
        var pointer: ListNode = result
        var prevPointer: ListNode?
        var temp: Int
        do {
            temp = (leftPointer?.`val` ?: 0) + (rightPointer?.`val` ?: 0) + pointer.`val`
            pointer.`val` = temp % 10
            leftPointer = leftPointer?.next
            rightPointer = rightPointer?.next
            pointer.next = ListNode(temp / 10)
            prevPointer = pointer
            pointer = pointer.next
        } while(leftPointer != null || rightPointer != null)
        if (pointer?.`val` == 0) {
            prevPointer?.next = null
        }
        return result
    }
}
