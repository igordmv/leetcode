//https://leetcode.com/problems/reverse-linked-list-ii/
fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    val list = LinkedList<Int>()
    var index = 0;
    var temp = head
    while (temp != null){
        index++
        if(index in left..right) list.add(temp!!.`val`)
        temp = temp.next
    }
    temp = head
    index = 0
    while (temp != null){
        index++
        if(index in left..right) temp.`val` = list.removeLast()
        temp = temp.next
    }
    return head
}