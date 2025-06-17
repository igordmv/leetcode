//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun deleteDuplicates(head: ListNode?): ListNode? {
    var h = head
    while (h?.next != null) {
        if (h?.`val` == h?.next?.`val`) {
            h.next = h.next.next
        } else {
            h = h.next
        }
    }
    return head
}