object ScalaSolution104 {

  /**
   * 二叉树的最大深度
   * 左右子树的最大深度+1
   *
   * @param root
   * @return
   */
  def maxDepth(root: TreeNode): Int = {
    if (root == null) return 0
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
  }

}
