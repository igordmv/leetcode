//https://leetcode.com/problems/linked-list-cycle/
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head?.next
        var fast = head?.next?.next
        while (fast != null) {
            if (slow == fast) {
                return true
            }
            slow = slow?.next
            fast = fast?.next?.next
        }
        return false
    }