# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        dummy = ListNode(0, head)
        pre, cur = dummy, head #pointer

        while cur and cur.next: # 2 nodes reverse
        # save pointers
            nxtPair = cur.next.next
            sec = cur.next #second

            #reverse pair
            sec.next = cur
            cur.next = nxtPair
            pre.next = sec

            #update pointers(for next pair)
            pre = cur
            cur = nxtPair

        return dummy.next 


        
