//https://leetcode.com/problems/add-two-numbers/
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var temp = dummy
    var carry = 0
    
    var l1Current = l1
    var l2Current = l2
    
    while (l1Current != null || l2Current != null || carry != 0) {
        val val1 = l1Current?.`val` ?: 0
        val val2 = l2Current?.`val` ?: 0
        
        val sum = val1 + val2 + carry
        carry = sum / 10
        temp.next = ListNode(sum % 10)
        temp = temp.next!!
        
        l1Current = l1Current?.next
        l2Current = l2Current?.next
    }
    
    return dummy.next
}