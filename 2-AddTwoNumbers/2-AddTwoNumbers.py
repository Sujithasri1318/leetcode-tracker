# Last updated: 7/9/2026, 10:07:14 AM
class Solution:
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode(0)
        current = dummy 
        carry = 0
        while l1 or l2 or carry:
            val1 = 0
            val2 = 0

            if l1:
                val1 = l1.val
                l1 = l1.next
            if l2:
                val2 = l2.val
                l2 = l2.next

            total = val1 + val2 + carry
            carry = total // 10

            current.next = ListNode(total % 10)
            current = current.next

        return dummy.next