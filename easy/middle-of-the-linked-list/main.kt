//https://leetcode.com/problems/middle-of-the-linked-list/
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun middleNode(head: ListNode?): ListNode? {
    var fast = head
    var slow = head
    while (fast?.next != null) {
        fast = fast.next.next
        slow = slow?.next
    }
    return slow
}