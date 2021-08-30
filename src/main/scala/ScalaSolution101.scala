object ScalaSolution101 {

  /**
   * 判断一个二叉树是否镜像对称
   * 左右对称转换为左右子树的对称
   *
   * @param root
   * @return
   */
  def isSymmetric(root: TreeNode): Boolean = {
    return check(root, root)
  }

  /**
   * 通过左右两个指针，分别向左向右遍历
   *
   * @param left
   * @param right
   * @return
   */
  def check(left: TreeNode, right: TreeNode): Boolean = {
    if (left == null && right == null) {
      return true
    }
    if (left == null || right == null) {
      return false
    }
    return (left.value == right.value) && check(left.left, right.right) && check(left.right, right.left)
  }

  def main(args: Array[String]): Unit = {

  }

}
