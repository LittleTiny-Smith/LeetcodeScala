object ScalaSolution94 {

  /**
   * 二叉树中序遍历
   * 左根右，递归遍历左右子树
   *
   * @param root
   * @return
   */
  def inorderTraversal(root: TreeNode): List[Int] = {
    if (root == null) return List()
    if (root.left == null && root.right == null) return List(root.value)
    val leftList: List[Int] = inorderTraversal(root.left)
    val rightList: List[Int] = inorderTraversal(root.right)
    var result: List[Int] = List()

    if (leftList != null) {
      result = result.appendedAll(leftList)
    }
    result = result.appended(root.value)
    if (rightList != null) {
      result = result.appendedAll(rightList)
    }

    return result
  }


  def main(args: Array[String]): Unit = {
    val node31: TreeNode = new TreeNode(31, null, null)
    val node32: TreeNode = new TreeNode(32, null, null)
    val node33: TreeNode = new TreeNode(33, null, null)
    val node34: TreeNode = new TreeNode(34, null, null)

    val node21: TreeNode = new TreeNode(21, node31, node32)
    val node22: TreeNode = new TreeNode(22, node33, node34)

    val root: TreeNode = new TreeNode(11, node21, node22)

    println(inorderTraversal(root))

  }

}
