object ScalaSolution27 {

  /**
   * 移除元素
   * 通过快慢指针标注不需要移除的元素的位置，并放在数组前面
   *
   * @param nums
   * @param `val`
   * @return
   */
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var i = 0
    var j = 0
    while (j < nums.length) {
      if (nums(j) != `val`) {
        nums(i) = nums(j)
        i += 1
      }
      j += 1
    }
    return i
  }

  def main(args: Array[String]): Unit = {
    val nums: Array[Int] = Array(0, 1, 3, 2, 1, 2, 5, 6, 1, 4)
    val `val`: Int = 1
    val len = removeElement(nums, `val`);
    for (i <- 0 to len - 1) {
      println(nums(i))
    }
  }
}
