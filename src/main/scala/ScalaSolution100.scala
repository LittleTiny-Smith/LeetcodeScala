import scala.util.control._

object ScalaSolution100 {

  /**
   * 判断两个二叉树是否相同
   * 要求结构与每个节点的值相等
   * @param p
   * @param q
   * @return
   */
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    var result: Boolean = true
    if (p == null && q == null) {
      return true
    } else if (p != null && q != null) {
      if (p.value == q.value) {
        if (p.left != null && q.left != null) {
          result = result && isSameTree(p.left, q.left)
        } else if (p.left == null && q.left == null) {
          return true
        } else {
          return false
        }
        if (p.right != null && q.right != null) {
          result = result && isSameTree(p.right, q.right)
        } else if (p.right == null && q.right == null) {
          return true
        } else {
          return false
        }
      } else {
        return false
      }
    } else {
      return false
    }
    return result
  }


  def main(args: Array[String]): Unit = {

  }

}
