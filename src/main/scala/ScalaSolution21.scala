import scala.collection.mutable

object ScalaSolution21 {

  /**
   * 合并两个有序的链表
   * 递归合并
   * @param l1
   * @param l2
   * @return
   */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    else if (l2 == null) return l1
    else if (l1.x < l2.x) {
      l1.next = mergeTwoLists(l1.next, l2)
      return l1
    } else {
      l2.next = mergeTwoLists(l1, l2.next)
      return l2
    }
  }

  def main(args: Array[String]): Unit = {

  }

}


