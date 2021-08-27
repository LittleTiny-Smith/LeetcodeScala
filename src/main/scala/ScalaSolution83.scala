object ScalaSolution83 {

  /**
   * 删除排序链表中的重复元素
   * 链表长度为0或1，返回当前链表
   * 遍历链表，如果next重复，则删除，current.next = next.next
   * 并判断删除后current与next
   * 如果不重复，遍历一下个
   *
   * @param head
   * @return
   */
  def deleteDuplicates(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    var current: ListNode = head
    var next: ListNode = head.next
    while (current != null && current.next != null) {
      next = current.next
      if (current.x == next.x) {
        current.next = next.next
      } else {
        current = current.next
      }
    }
    return head
  }

  def main(args: Array[String]): Unit = {

  }
}
