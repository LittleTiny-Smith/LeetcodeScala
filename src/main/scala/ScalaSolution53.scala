object ScalaSolution53 {
  /**
   * 求最大子序列的和
   * 动态规划
   * 分治法
   * @param nums
   * @return
   */
  def maxSubArray(nums: Array[Int]): Int = {
    var pre: Int = 0
    var maxAns: Int = nums(0)
    for (elem <- nums) {
      pre = Math.max(pre + elem, elem)
      maxAns = Math.max(maxAns, pre)
    }
    return maxAns
  }

  def main(args: Array[String]): Unit = {

  }
}
